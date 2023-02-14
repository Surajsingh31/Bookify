import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { BookComponent } from './book/book.component';
import { CartComponent } from './cart/cart.component';
import { CharityComponent } from './charity/charity.component';
import { DonateComponent } from './donate/donate.component';
import { EBooksComponent } from './e-books/e-books.component';
import { HomeComponent } from './home/home.component';
import { HomepageComponent } from './homepage/homepage.component';
import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';
import { RegisterComponent } from './register/register.component';
import { UserDashBoardComponent } from './user-dash-board/user-dash-board.component';
import { WishlistComponent } from './wishlist/wishlist.component';

const routes: Routes = [
  {path:'',component:HomepageComponent},
  {path:'home',component:HomepageComponent},
  {path:'user',component:UserDashBoardComponent},
  {path:'admin',component:AdminDashboardComponent},
  {path:'book',component:BookComponent},
  {path:'login',component:LoginComponent},
  {path:'register',component:RegisterComponent},
  {path:'ebooks',component:EBooksComponent},
  {path:'cart',component:CartComponent},
  {path:'wishlist',component:WishlistComponent},
  {path:'charity',component:CharityComponent},
  {path:'donate',component:DonateComponent},
  {path:'navbar',component:NavbarComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
