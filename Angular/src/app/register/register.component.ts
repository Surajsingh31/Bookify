import { HttpClient } from '@angular/common/http';
import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { City, Country, State } from 'country-state-city';
import { BookifyService } from '../bookify.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  customer:any;
  @ViewChild('country')
  country!: ElementRef;
  @ViewChild('city')
  city!: ElementRef;
  @ViewChild('state')
  state!: ElementRef;
countries = Country.getAllCountries();
states:any = null;
cities:any = null;

selectedCountry:any;
selectedState:any;
selectedCity:any;
registrationForm:FormGroup;


emailRegex ="^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$"

constructor(
  private fb:FormBuilder,
private httpClient: HttpClient,
private service:BookifyService

){
  this.registrationForm = this.fb.group({
    custId:[],
    custName:['',Validators.required],
    email:['',Validators.required,Validators.pattern(this.emailRegex)],
    gender:[null,Validators.required],
    country:['',Validators.required],
          state:['',Validators.required],
          city:['',Validators.required],
          pincode:['',Validators.required],
          address:['',Validators.required],
          phoneNumber:['',Validators.required],
          password:['',Validators.required],
          type:['Regular',Validators.required],
          coins:[10]
  });
  this.customer = {custId:"", custName:"", gender:"", country:"",state:"",city:"" , email:"", password: "",address : "",phoneNumber:"",type:"",coins:"",pincode:""};
  


  
}

  ngOnInit(): void {
      
  }
  onCountryChange($event:any): void {
    this.states = State.getStatesOfCountry(JSON.parse(this.country.nativeElement.value).isoCode);
    this.selectedCountry = JSON.parse(this.country.nativeElement.value);
    console.log(this.selectedCountry,"Selected Country")
    this.registrationForm.get('country')?.setValue(this.selectedCountry.name);
    this.cities = this.selectedState = this.selectedCity = null;
  }

  onStateChange($event:any): void {
    this.cities = City.getCitiesOfState(JSON.parse(this.country.nativeElement.value).isoCode, JSON.parse(this.state.nativeElement.value).isoCode)
    this.selectedState = JSON.parse(this.state.nativeElement.value);
    this.selectedCity = null;
    this.registrationForm.get('state')?.setValue(this.selectedState.name);
  }

  onCityChange($event:any): void {
    this.selectedCity = JSON.parse(this.city.nativeElement.value)
    this.registrationForm.get('city')?.setValue(this.selectedCity.name);
  }
  registerCustomer()
  {
    console.log(this.registrationForm.value);
    this.customer = this.registrationForm.value;
    //this.userService.registerCustomer(this.registrationForm.value).subscribe((result: any) => {console.log(result);});
    this.service.registerCustomer(this.customer).subscribe((result:any) =>{
          console.log(result);
    });
  
  
  }
  resetForm()
  {
    this.registrationForm.reset(

      
    ) ;
    this.selectedCountry ='';
    this.selectedCity='';
    this.selectedState='';

  }

}
