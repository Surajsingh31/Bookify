import { Component, OnInit } from '@angular/core';
declare var jQuery : any;

@Component({
  selector: 'app-profile-card',
  templateUrl: './profile-card.component.html',
  styleUrls: ['./profile-card.component.css']
})
export class ProfileCardComponent implements OnInit {

  ngOnInit(): void {
      
  }
  edit(){
    console.log("abc");
    jQuery("#myModal").modal('show');

  }

}
