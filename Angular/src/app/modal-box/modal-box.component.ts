import { Component, OnInit } from '@angular/core';
declare var jQuery: any;

@Component({
  selector: 'app-modal-box',
  templateUrl: './modal-box.component.html',
  styleUrls: ['./modal-box.component.css']
})
export class ModalBoxComponent implements OnInit {

  ngOnInit(): void {
      
  }

  edit(){
    console.log("abc");
    jQuery("#myModal").modal('show');

  }

}
