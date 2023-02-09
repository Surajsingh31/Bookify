import { Component, OnInit } from '@angular/core';
import { ModalDismissReasons, NgbModal } from '@ng-bootstrap/ng-bootstrap';
declare var jQuery : any;


@Component({
  selector: 'app-profilecard',
  templateUrl: './profilecard.component.html',
  styleUrls: ['./profilecard.component.css']
})
export class ProfilecardComponent implements OnInit {

  ngOnInit(): void {


      
  }
  edit(){

    jQuery("#myModal").modal('show');

  }


//   view(book:any){
//     console.log(book);
//     this.modalBook = book;
//     jQuery('#myModal').modal('show');
//   }
  
}
