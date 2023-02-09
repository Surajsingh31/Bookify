
import { BrowserModule } from '@angular/platform-browser';
import { AdmindashComponent } from './admindash/admindash.component';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EditProfileComponent } from './edit-profile/edit-profile.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { UserdashComponent } from './userdash/userdash.component';
import { TestComponent } from './test/test.component';
import { ProfilecardComponent } from './profilecard/profilecard.component';
import { ProfiletableComponent } from './profiletable/profiletable.component';
import { ModalboxComponent } from './modalbox/modalbox.component';
import { NgModule } from '@angular/core';
import { NgbModalModule, NgbModule } from '@ng-bootstrap/ng-bootstrap';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ProfileComponent,
    AdmindashComponent,
    UserdashComponent,
    EditProfileComponent,
    TestComponent,
    ProfilecardComponent,
    ProfiletableComponent,
    ModalboxComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    NgbModalModule,
    MatDialogModule,
    MatButtonModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
