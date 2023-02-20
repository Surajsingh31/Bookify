import { Component, OnInit } from '@angular/core';
import { BookifyService } from '../bookify.service';

@Component({
  selector: 'app-donate',
  templateUrl: './donate.component.html',
  styleUrls: ['./donate.component.css']
})
export class DonateComponent implements OnInit {

  donation:any;
  constructor(private service : BookifyService)
  {
    this.donation={custId:"",author:"",bookName:"",custName:"",description:"",email:"",genre:"",phoneNumber:"",publication:"",quantity:""};
  }

  ngOnInit(): void {
      
  }

  submitForm(registerForm:any)
  {
    console.log(registerForm);
    this.service.registerDonor(registerForm).subscribe((result: any) => {console.log(result);});

  }

}
