import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomepageComponent } from './homepage/homepage.component';
import { LoginComponent } from './login/login.component';
import { CartComponent } from './cart/cart.component';
import { BookComponent } from './book/book.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RegisterComponent } from './register/register.component';
import { EBooksComponent } from './e-books/e-books.component';
import { FooterComponent } from './footer/footer.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { AdminModalBoxComponent } from './admin-modal-box/admin-modal-box.component';
import { UserDashBoardComponent } from './user-dash-board/user-dash-board.component';
import { ProfileCardComponent } from './profile-card/profile-card.component';
import { ProfileTableComponent } from './profile-table/profile-table.component';
import { ModalBoxComponent } from './modal-box/modal-box.component';
import { WishlistComponent } from './wishlist/wishlist.component';
import { CharityComponent } from './charity/charity.component';
import { PaymentComponent } from './payment/payment.component';
import { DonateComponent } from './donate/donate.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ProfileComponent,
    NavbarComponent,
    HomepageComponent,
    LoginComponent,
    CartComponent,
    BookComponent,
    RegisterComponent,
    EBooksComponent,
    FooterComponent,
    AdminDashboardComponent,
    AdminModalBoxComponent,
    UserDashBoardComponent,
    ProfileCardComponent,
    ProfileTableComponent,
    ModalBoxComponent,
    WishlistComponent,
    CharityComponent,
    PaymentComponent,
    DonateComponent
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
