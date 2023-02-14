import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { BookifyService } from '../bookify.service';
declare var jQuery : any;

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent implements OnInit {

  BookifyService: any;
  edit(){
    console.log("abc");
    jQuery("#myModal").modal('show');

  } 
  edit1(){
    console.log("view");
    jQuery("#myModal1").modal('show');

  } 
  users: any[] | undefined;

  books: any[] | undefined;

  
  
  constructor(private http: HttpClient, private bookify: BookifyService) {}

  ngOnInit() {
    this.fetchBooks();

    this.http.get<any[]>('http://localhost:8085/getAllCustomers').subscribe(users => {
      this.users = users;
    });
  }

  deleteUser(custId: any) {
    this.bookify.deleteCustomer(custId).subscribe(
      (response: any) => {
        console.log(response);
        // handle success, e.g. show success message to user
      },
      (error: any) => {
        console.log(error);
        // handle error, e.g. show error message to user
      }
    );
  }
  
  

  fetchBooks() {

    this.http.get<any[]>('http://localhost:8085/getAllBooks').subscribe((data: any[]) => {
      // Handle the response data here
      this.books = data;
    });
  }

  onSubmit(form: NgForm) {
    const formData = new FormData();
    formData.append('photo', form.value.photo);
    formData.append('name', form.value.name);
    formData.append('price', form.value.price);
    formData.append('quantity', form.value.quantity);

    this.http.post('/api/books', formData).subscribe(() => {
      console.log('Book added successfully');
      // Clear form and update book list
      form.reset();
      this.fetchBooks();
    });
  }

}
