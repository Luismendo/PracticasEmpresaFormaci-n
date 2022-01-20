import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditFormsComponent } from './edit-forms/edit-forms.component';
import { TablePersonComponent } from './table-person/table-person.component';

const routes: Routes = [
  {path: '',
   component:TablePersonComponent
  },
  {path: 'formEdit/:id',
  component:EditFormsComponent
 },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
