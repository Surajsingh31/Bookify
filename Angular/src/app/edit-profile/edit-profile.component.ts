import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-edit-profile',
  templateUrl: './edit-profile.component.html',
  styleUrls: ['./edit-profile.component.css']
})
export class EditProfileComponent implements OnInit {

  uploadPhoto(event: Event) {
    // Code to handle photo upload
  }

  updateProfile(form : NgForm) {
    // Code to update profile
  }

  name: string | undefined;
  phone: string | undefined;
  email: string | undefined;
  address: string | undefined;

  constructor() {}

  ngOnInit() {}

  closeModal() {
    // logic to close modal
  }

  saveChanges() {
  }
}
