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
  productToBeAddedInWishList: Subject<any>;

  cartItems:any;
  wishList:any;
  customer1:any;
  custId:any;

  constructor(private httpClient:HttpClient) { 

    this.cartItems = [];
    this.wishList = [];
    this.isUserLogged = false;
    this.loginStatus = new Subject();
    this.productToBeAdded = new Subject();
    this.productToBeAddedInWishList = new Subject();
    this.customer1 = {custId:'',custName:'',email:'',gender:'',phoneNumber:'',password:'',type:'',address:'',city:'',pincode:'',country:'',state:'',coins:''}
  }

  addToCart(book: any) {
      this.productToBeAdded.next(book);
  }
  getCartStatus(): any {
    return this.productToBeAdded.asObservable();
  }

  addToWishList(book: any){
      this.productToBeAddedInWishList.next(book);

  }
  getWishListStatus(){
    return this.productToBeAddedInWishList.asObservable();
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

  getAllCustomers(){
    return this.httpClient.get("/getAllCustomers");
  }
  registerCustomer(customer:any){
    return this.httpClient.post("/registerCustomer",customer);
  }

  getCustomer(customer: any) {
    this.customer1 = customer;
    return this.httpClient.get("/getCustomer/" + customer.email + "/" + customer.password).toPromise();
  }

  getAlleBooks(){
    return this.httpClient.get("/getAllEBooks");
  }
  deleteeBookById(bookId:any){

    return this.httpClient.delete("/deleteeBookById/" + bookId);

  }

  sortEbook(genre:any){
    return this.httpClient.get("/getEBooksByGenre/" + genre);
  }

  sort2Ebook(genre:any,type:any){
    if(type == "Low"){
      return this.httpClient.get("/getEBooksByPrice/" + genre);
    }
    else if(type == "High"){
      return this.httpClient.get("/getEBooksByPriceHigh/" + genre);
    }
    else if(type == "A-Z"){
      return this.httpClient.get("/getEBooksByAlphabet/" + genre);
    }
    return this.httpClient.get("/getEBooksByAlphabetDesc/" + genre);
  }

  getBookByName(bookName:any){
    return this.httpClient.get("/getBookByName/" + bookName );
  }

  getCustomerProfile(){
    return this.httpClient.get("/getCustomer/" + this.customer1.email + "/" + this.customer1.password);
  }

  deleteCustomer(custId:any){

    return this.httpClient.delete("/deleteCustomerByCustId/",custId);

  }

  registerDonor(donation: any): any {
    return this.httpClient.post('/registerDonor', donation);
  }

  getAllDonor(): any {
    return this.httpClient.get('/getAllDonor');
  }

  getOrderByCustId(custId:any){

    return this.httpClient.get('/getOrderByCustId/' + 3);
  }

  registerCharity(value:any){

    this.httpClient.post("/registerCharity",value);

  }

}
