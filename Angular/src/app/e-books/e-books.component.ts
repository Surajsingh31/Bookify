import { Component, OnInit } from '@angular/core';
import { BookifyService } from '../bookify.service';

@Component({
  selector: 'app-e-books',
  templateUrl: './e-books.component.html',
  styleUrls: ['./e-books.component.css']
})
export class EBooksComponent implements OnInit {

  ebooks:any;

  genre:any;
  type:any;

  constructor(private Service:BookifyService){

  }


  ngOnInit(): void {
    this.Service.getAlleBooks().subscribe((data:any) =>{
      this.ebooks = data;
  });
  this.type = "A-Z";
  this.genre = "All";
}

  sort1(genre:any){
    //console.log(genre);
    if(genre=="All"){
      this.Service.getAlleBooks().subscribe((data:any) =>{
        this.ebooks = data;
      });
    }
    else{
    this.Service.sortEbook(genre).subscribe((data:any) =>{
      this.ebooks = data;

    });
  }
  }
  sort2(genre:any,type:any){


      this.Service.sort2Ebook(genre,type).subscribe((data:any) =>{
        this.ebooks = data;

      });
    
  }
 

}
