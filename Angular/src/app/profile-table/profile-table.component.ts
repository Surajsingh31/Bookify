import { Component, OnInit } from '@angular/core';
import { BookifyService } from '../bookify.service';

@Component({
  selector: 'app-profile-table',
  templateUrl: './profile-table.component.html',
  styleUrls: ['./profile-table.component.css']
})
export class ProfileTableComponent implements OnInit {

  orders:any;
  customer:any;
  constructor(private service:BookifyService){
    this.orders = [];
    this.customer = {custId:'',custName:'',email:'',gender:'',phoneNumber:'',password:'',type:'',address:'',city:'',pincode:'',country:'',state:'',coins:''};

  }
  ngOnInit(): void {
    
    this.service.getCustomerProfile().subscribe((data:any) =>{
      this.customer = data;
 });

    this.service.getOrderByCustId(this.customer.custId).subscribe((data:any) =>{
        this.orders = data;
    });
    console.log(this.orders);
    console.log(this.customer);
      
  }

}
