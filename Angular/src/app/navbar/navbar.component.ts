import { Component, OnInit } from '@angular/core';
import { BookifyService } from '../bookify.service';

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
  book:any;
  wishList:any;
  isExpanded = false;
  bookName:any;

  toggleSearchInput() {
    this.showSearchInput = !this.showSearchInput;
  }

  constructor(private service:BookifyService){

    this.cartItems = this.service.cartItems;
    this.wishList = this.service.wishList;
    this.book = {bookId:'',bookName:'',
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
    
  }
  searchBook(){

    this.book = this.service.getBookByName(this.bookName);

  }

}
