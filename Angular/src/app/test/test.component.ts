import { Component, OnInit } from '@angular/core';
declare var jQuery : any;

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit{
  ngOnInit(): void {


      
  }
  edit(){
    console.log("abc");
    jQuery("#myModal").modal('show');

  }
 
}

