
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Subject, throwError } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class UserService {


  constructor(private httpClient: HttpClient) {

   }


  getAllCustomers():any{
    return this.httpClient.get('/getAllCustomers');
  }

  getCustomerById(custId:any):any{

  }
  registerCustomer(customer:any)
  {
    return this.httpClient.post('http://localhost:8085/registerCustomer', customer);
  }
  updateCustomer(customer :any)
  {
    return this.httpClient.put('/updateCustomer', customer);
  }
  
  deleteCustomerByCustId(customer:any)
  {
    return this.httpClient.delete('/deleteCustomerByCustId/' + customer.custId);
  }

  // getCustomer(customer: any) {
  //   return this.httpClient.post("http://localhost:8085/login/user",customer);
  // }
  getCustomer(customer: any) {
    return this.httpClient.get("/getEmployee/" + customer.email + "/" + customer.password);
  }




}
