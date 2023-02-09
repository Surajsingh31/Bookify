import { Component, OnInit } from '@angular/core';
declare var jQuery : any;
@Component({
  selector: 'app-admindash',
  templateUrl: './admindash.component.html',
  styleUrls: ['./admindash.component.css']
})
export class AdmindashComponent implements OnInit {
  ngOnInit(): void {


      
  }
  edit(){
    console.log("abc");
    jQuery("#myModal").modal('show');

  }
}

