import { Component } from '@angular/core';
declare var jQuery : any;

@Component({
  selector: 'app-modalbox',
  templateUrl: './modalbox.component.html',
  styleUrls: ['./modalbox.component.css']
})
export class ModalboxComponent {
  
  ngOnInit(): void {


      
  }
  edit(){
    console.log("abc");
    jQuery("#myModal").modal('show');

  }
  
}


