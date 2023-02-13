import { Component, OnInit } from '@angular/core';
declare var jQuery : any;

@Component({
  selector: 'app-admin-modal-box',
  templateUrl: './admin-modal-box.component.html',
  styleUrls: ['./admin-modal-box.component.css']
})
export class AdminModalBoxComponent implements OnInit {

  ngOnInit(): void {
      
  }
  edit(){
    console.log("abc");
    jQuery("#myModal").modal('show');

  }

}
