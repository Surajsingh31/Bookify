import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BookifyService } from '../bookify.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  cartItems:any;
  totalCost:any;

  strikeCheckout:any = null;

  constructor(private service:BookifyService,private router:Router){
    this.cartItems=[];
  }
  ngOnInit(): void {
      this.totalCost = 0;
      this.cartItems = this.service.cartItems;
      this.cartItems.forEach((book:any) =>{
          this.totalCost += book.price;
      });

  }

 payment(amount:any){
    this.stripePaymentGateway();
    const strikeCheckout = (<any>window).StripeCheckout.configure({
      key: 'pk_test_51MZqTMSDktozLZ3rQ4AOBIVLwO0vrxYz5QSEUt3XnZyqcYag7cXpvyBreqvWXuyGZCKLqYvYoKEyzr7KMR1vzs0E00VWlq6MfF',
      locale: 'auto',
      token: function (stripeToken: any) {
        console.log(stripeToken)
         alert('Payment Successfull');

      }
    });
  
    strikeCheckout.open({
      name: 'Payment',
      description: 'Pay your Order Amount',
      amount: amount * 100
    });
  }
  
    stripePaymentGateway() {
    if(!window.document.getElementById('stripe-script')) {
      const scr = window.document.createElement("script");
      scr.id = "stripe-script";
      scr.type = "text/javascript";
      scr.src = "https://checkout.stripe.com/checkout.js";

      scr.onload = () => {
        this.strikeCheckout = (<any>window).StripeCheckout.configure({
          key: 'pk_test_51MZqTMSDktozLZ3rQ4AOBIVLwO0vrxYz5QSEUt3XnZyqcYag7cXpvyBreqvWXuyGZCKLqYvYoKEyzr7KMR1vzs0E00VWlq6MfF',
          locale: 'auto',
          token: function (token: any) {
            console.log(token)
            alert('Payment via stripe successfull!');
            // this.router.navigate(['user']);
          }
        });
      }
        
      window.document.body.appendChild(scr);


      //  await this.router.navigate(['user']);
    }
  }


  deleteFromCart(bookId:any){

        const i = this.cartItems.findIndex((element: any) => {
          return bookId === element.bookId;
        });
        this.cartItems.splice(i, 1);
        // this.router.navigate(['cart']);
        this.ngOnInit();
  }

  }



