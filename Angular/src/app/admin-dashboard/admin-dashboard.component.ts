import { Component, OnInit } from '@angular/core';
declare var jQuery : any;

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {

  ngOnInit(): void {
      
  }
  edit(){
    console.log("abc");
    jQuery("#myModal").modal('show');

  } 

}
