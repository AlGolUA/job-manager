import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainLayoutComponent } from './shared/main-layout/main-layout.component';
import { MainPageAdminComponent } from './main-page-admin/main-page-admin.component';
import { MainPageWorkerComponent } from './main-page-worker/main-page-worker.component';
import { MainPageOrgComponent } from './main-page-org/main-page-org.component';
import { JobPageComponent } from './job-page/job-page.component';
import { ProfilePageComponent } from './shared/profile-page/profile-page.component';
import { MainPageComponent } from './shared/main-page/main-page.component';

@NgModule({
  declarations: [
    AppComponent,
    MainLayoutComponent,
    MainPageAdminComponent,
    MainPageWorkerComponent,
    MainPageOrgComponent,
    JobPageComponent,
    ProfilePageComponent,
    MainPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
