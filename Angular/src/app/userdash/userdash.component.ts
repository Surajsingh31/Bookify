import { Component } from '@angular/core';
declare var jQuery : any;

@Component({
  selector: 'app-userdash',
  templateUrl: './userdash.component.html',
  styleUrls: ['./userdash.component.css']
})
export class UserdashComponent {

  ngOnInit(): void {


      
  }
  edit(){
    console.log("abc");
    jQuery("#myModal").modal('show');

  }
}
