import { Component, OnInit } from '@angular/core';
import { BookifyService } from '../bookify.service';

@Component({
  selector: 'app-wishlist',
  templateUrl: './wishlist.component.html',
  styleUrls: ['./wishlist.component.css']
})
export class WishlistComponent implements OnInit {

  wishlist:any;
  constructor(private service:BookifyService){

  }

  ngOnInit(): void {

    this.wishlist = this.service.wishList;
      
  }
  addToCart(book:any){

    this.service.addToCart(book);

  }
  remove(bookId:any){

    const i = this.wishlist.findIndex((element: any) => {
      return bookId === element.bookId;
    });
    this.wishlist.splice(i, 1);

  }

}
