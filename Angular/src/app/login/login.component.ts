import { Component, OnInit, } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { GoogleLoginProvider, SocialAuthService, SocialUser } from 'angularx-social-login';
import { BookifyService } from '../bookify.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  customer:any;
  emailRegex ="^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$"
  
  loginForm: FormGroup;
  socialUser!: SocialUser;
  email:any;
  password:any;


  constructor(private router:Router,private fb:FormBuilder,private Service:BookifyService){
    this.loginForm = this.fb.group({
      email:['',[Validators.required,Validators.pattern(this.emailRegex)]],
      password:['',Validators.required]
    });

    // private formBuilder: FormBuilder; 
    // private socialAuthService: SocialAuthService;
  }

  ngOnInit(): void {

      
  }

  // loginWithGoogle(): void {
  //   this.socialAuthService.signIn(GoogleLoginProvider.PROVIDER_ID);
  // }

  async submitForm(){

    let formValues = this.loginForm.value;
    for(const property in formValues){
      if(formValues[property].trim() == ""){
        this.loginForm.get(property)?.markAsTouched();  
    }
  }

  await this.Service.getCustomer(this.loginForm.value).then((data: any) => {this.customer = data; console.log(data);});

  if (this.customer != null) {
    if(this.customer.email === "admin@gmail.com" && this.customer.password === "admin" ){
    alert('Successfully LoggedIn...');
    this.Service.setUserLoggedIn();
    this.router.navigate(['admin']);
  }
  else{
    this.Service.setUserLoggedIn();
    this.router.navigate(['user']);
  }
  } else {
    alert('Invalid Credentials!!!');
    this.router.navigate(['login']);
  }
}

  // console.log(formValues.email);
  // console.log(formValues.password);

}
