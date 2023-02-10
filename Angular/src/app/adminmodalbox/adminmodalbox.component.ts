import { Component } from '@angular/core';
declare var jQuery : any;

@Component({
  selector: 'app-adminmodalbox',
  templateUrl: './adminmodalbox.component.html',
  styleUrls: ['./adminmodalbox.component.css']
})
export class AdminmodalboxComponent {

  ngOnInit(): void {


      
  }
  edit(){
    console.log("abc");
    jQuery("#myModal").modal('show');

  }
}
