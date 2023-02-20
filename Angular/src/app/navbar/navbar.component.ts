import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BookifyService } from '../bookify.service';
declare var jQuery:any;

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit{

  isLoggedIn:any;
  showSearchInput = false;
  loginStatus:any;
  cartItems:any;
  modalBook:any;
  wishList:any;
  isExpanded = false;
  bookName:any;

  toggleSearchInput() {
    this.showSearchInput = !this.showSearchInput;
  }

  constructor(private service:BookifyService,private router:Router){

    this.cartItems = this.service.cartItems;
    this.wishList = this.service.wishList;
    this.modalBook = {bookId:'',bookName:'',
    authors : '',
    description : '', 
    genre : '',
    image_path : '',
    price: '',
    publications : '',
    quantity:'',
    type:''
    }
    

  }

  ngOnInit(): void {

    this.service.getLoginStatus().subscribe((data:any) =>{
      this.loginStatus = data;
  });

this.service.getCartStatus().subscribe((data: any) => {
      this.cartItems.push(data);

});

this.service.getWishListStatus().subscribe((data: any) => {
  this.wishList.push(data);

});

    
  }
  
  logout(){
    this.service.setUserLoggedOut();
    this.router.navigate(['login']);
    
  }
  searchBook(){

     this.service.getBookByName(this.bookName).subscribe((data:any) =>{
          this.modalBook = data;
     });
     jQuery("#myModal").modal('show');

  }
  addToCart(book:any){
    this.service.addToCart(book);
  }

}
