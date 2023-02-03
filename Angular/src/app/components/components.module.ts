import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core'
import { RouterModule } from '@angular/router'
import { CommonModule } from '@angular/common'

import { NavigationLinks } from './navigation-links/navigation-links.component'
import { GalleryCard1 } from './gallery-card1/gallery-card1.component'

@NgModule({
  declarations: [NavigationLinks, GalleryCard1],
  imports: [CommonModule, RouterModule],
  exports: [NavigationLinks, GalleryCard1],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
})
export class ComponentsModule {}
