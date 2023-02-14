import { Component, OnInit } from '@angular/core';
import { BookifyService } from '../bookify.service';
declare var jQuery : any;

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css'],
})
export class BookComponent implements OnInit{

  books:any;
  genre:any;
  type:any;
  modalBook:any;
  constructor(private service:BookifyService){
    this.modalBook = {bookId:'',bookName:'',
    authors : '',
    description : '', 
    genre : '',
    image_path : '',
    price: '',
    publications : '',
    quantity:'',
    type:'',
    booksInCart:''
    }
  }
  ngOnInit(): void {

    this.service.getAllBooks().subscribe((data:any) =>{
      this.books = data;
    });
    this.type = "Low";
    this.genre = "All";
      
  }

  view(book:any){
      console.log(book);
      this.modalBook = book;
      jQuery('#myModal').modal('show');
  }
  sort1(genre:any){
    //console.log(genre);
    if(genre=="All"){
      this.service.getAllBooks().subscribe((data:any) =>{
        this.books = data;
      });
    }
    else{
    this.service.sort(genre).subscribe((data:any) =>{
      this.books = data;

    });
  }
  }
  sort2(genre:any,type:any){


      this.service.sort3(genre,type).subscribe((data:any) =>{
        this.books = data;

      });
    
  }

  deleteBook(book:any):any{
      this.service.deleteBook(book.bookId).subscribe((data:any) =>{
          console.log(book);
      });

      const i = this.books.findIndex((element: any) => {
        return book.productId === element.productId;
      });
      this.books.splice(i, 1);
  }
  addToCart(book:any):any{

    //console.log(book);
    this.service.addToCart(book);

  }
  addToWishList(book:any){
    this.service.addToWishList(book);
  }


}