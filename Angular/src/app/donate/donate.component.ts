import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-donate',
  templateUrl: './donate.component.html',
  styleUrls: ['./donate.component.css']
})
export class DonateComponent implements OnInit {

  ngOnInit(): void {
      
  }

  submitForm(registerForm:any)
  {
    console.log(registerForm);
  }

}
