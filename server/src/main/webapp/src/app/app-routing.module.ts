import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {MainLayoutComponent} from "./shared/main-layout/main-layout.component";
import {MainPageComponent} from "./shared/main-page/main-page.component";
import {MainPageWorkerComponent} from "./main-page-worker/main-page-worker.component";
import {MainPageOrgComponent} from "./main-page-org/main-page-org.component";
import { AdminModule } from './admin/admin.module';
import {MainPageAdminComponent} from "./main-page-admin/main-page-admin.component";

const routes: Routes = [
  {
    path: '', component: MainLayoutComponent, children: [
      {path: '', redirectTo: '/', pathMatch: 'full'},
      {path: '', component: MainPageComponent},
      // {path: 'admin', component: MainPageAdminComponent},
      {path: 'worker', component: MainPageWorkerComponent},
      {path: 'org', component: MainPageOrgComponent}
    ]
  },
  {
    // path: 'admin', loadChildren: './admin/admin.module.ts#AdminModule'
    path: 'admin', loadChildren: () => import('./admin/admin.module').then(() => AdminModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
