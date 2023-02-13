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

  toggleSearchInput() {
    this.showSearchInput = !this.showSearchInput;
  }

  constructor(private service:BookifyService){

    this.cartItems = this.service.cartItems;

  }

  ngOnInit(): void {

    this.service.getLoginStatus().subscribe((data:any) =>{
      this.loginStatus = data;
  });

this.service.getCartStatus().subscribe((data: any) => {
      this.cartItems.push(data);

});

    
  }
  
  logout(){
    
  }

}
