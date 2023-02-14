import { Component, OnInit } from '@angular/core';
import { BookifyService } from '../bookify.service';
declare var jQuery : any;

@Component({
  selector: 'app-profile-card',
  templateUrl: './profile-card.component.html',
  styleUrls: ['./profile-card.component.css']
})
export class ProfileCardComponent implements OnInit {

  customer:any
  constructor(private service:BookifyService){

  }

  ngOnInit(): void {

    // this.service.getCustomer(this.customer).then((data: any) => {this.customer = data; console.log(data);});

       this.customer = this.service.getCustomerProfile();
      console.log(this.customer);
    
      
  }
  edit(){
    console.log("abc");
    jQuery("#myModal").modal('show');

  }

}
