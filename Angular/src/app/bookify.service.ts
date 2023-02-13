import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BookifyService {

  isUserLogged:boolean;
  loginStatus:Subject<any>;
  productToBeAdded: Subject<any>

  cartItems:any;

  constructor(private httpClient:HttpClient) { 

    this.cartItems = [];
    this.isUserLogged = false;
    this.loginStatus = new Subject();
    this.productToBeAdded = new Subject();
  }

  addToCart(book: any) {
    // this.cartItems.push(book);
    this.productToBeAdded.next(book);
  }
  getCartStatus(): any {
    return this.productToBeAdded.asObservable();
  }

  getLoginStatus(): any{
    return this.loginStatus.asObservable();
  }

  setUserLoggedIn(){
    this.isUserLogged = true;
    this.loginStatus.next(this.isUserLogged);
  }
  
  setUserLoggedOut(){
    this.isUserLogged = false;
    this.loginStatus.next(this.isUserLogged);
  }

  getUserLogged(){
    return this.isUserLogged;
  }

  getAllBooks(){
    return this.httpClient.get("/getAllBooks");
  }

  deleteBook(bookId:any){

    return this.httpClient.delete("/deleteBookById/" + bookId);

  }

  sort(genre:any){
    return this.httpClient.get("/getBooksByGenre/" + genre);
  }

  sort3(genre:any,type:any){
    if(type == "Low"){
      return this.httpClient.get("/getBooksByPrice/" + genre);
    }
    else if(type == "High"){
      return this.httpClient.get("/getBooksByPriceHigh/" + genre);
    }
    else if(type == "A-Z"){
      return this.httpClient.get("/getBooksByAlphabet/" + genre);
    }
    return this.httpClient.get("/getBooksByAlphabetDesc/" + genre);
  }
  
}
