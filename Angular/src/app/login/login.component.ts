import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  customer:any;
  emailRegex ="^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$"
  

  loginForm:FormGroup;

  constructor(private router:Router,private fb:FormBuilder){
    this.loginForm = this.fb.group({
      email:['',[Validators.required,Validators.pattern(this.emailRegex)]],
      password:['',Validators.required]
    })
  }
  ngOnInit(): void {
      
  }
  submitForm(){

    let formValues = this.loginForm.value;
    for(const property in formValues){
      if(formValues[property].trim() == ""){
        this.loginForm.get(property)?.markAsTouched();  
          }
  }

}
}
