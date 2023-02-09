import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../user.service';
import {MatSnackBar} from '@angular/material/snack-bar'


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  customer:any;
  emailRegex ="^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$"
  

  loginForm:FormGroup;

  constructor(private router:Router,private loginservice:UserService,private fb:FormBuilder,
    private _snackBar:MatSnackBar){
    this.loginForm = this.fb.group({
      email:['',[Validators.required,Validators.pattern(this.emailRegex)]],
      password:['',Validators.required]
    })
  }
  ngOnInit(): void {

   // this.router.navigate(['register']);
  }


  submitForm() {

    let formValues = this.loginForm.value;
    for(const property in formValues){
      if(formValues[property].trim() == ""){
        this.loginForm.get(property)?.markAsTouched();  
          }
    }
    
    if(this.loginForm.valid){
      this.loginservice.getCustomer(this.loginForm.value).subscribe((result: any) => {
        console.log(result);});
        this._snackBar.open('Login Success');
        this.router.navigateByUrl('/Book')    }
  
  

    //localStorage.setItem('customer', JSON.stringify());
    // await this.loginservice.getCustomer(loginForm).then((data: any) => {this.customer = data; console.log(data);});

    // if (this.customer != null) {
    //   alert('Successfully LoggedIn...');
    //   this.loginservice.setUserLoggedIn();
    //   this.router.navigate(['book']);
    // } else {
    //   alert('Invalid Credentials!!!');
    //   this.router.navigate(['login']);
    // }
  }




//login with google

// signInWithGoogle():void{
//   this.authService.signIn(GoogleLoginProvider.PROVIDER_ID)
// }


}

