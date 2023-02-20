import { Component, OnInit } from '@angular/core';
import { BookifyService } from '../bookify.service';

@Component({
  selector: 'app-charity',
  templateUrl: './charity.component.html',
  styleUrls: ['./charity.component.css']
})
export class CharityComponent implements OnInit {

  constructor(private service:BookifyService){

  }

  ngOnInit(): void {
      
  }
  register(value:any){

    this.service.registerCharity(value);

  }

}
