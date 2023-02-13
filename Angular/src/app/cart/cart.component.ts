import { Component, OnInit } from '@angular/core';
import { BookifyService } from '../bookify.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  cartItems:any;
  constructor(private service:BookifyService){
    this.cartItems=[];
  }
  ngOnInit(): void {
      this.cartItems = this.service.cartItems;
  }

}
