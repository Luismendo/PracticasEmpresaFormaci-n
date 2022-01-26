import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CheckViewGuard } from './check-view.guard';
import { DetailPersonaComponent } from './detail-persona/detail-persona.component';
import { FormPersonaComponent } from './form-persona/form-persona.component';
import { IntroComponent } from './intro/intro.component';
import { LateralMenuComponent } from './lateral-menu/lateral-menu.component';
import { ModalComponent } from './modal/modal.component';
import { TablePersonaComponent } from './table-persona/table-persona.component';

const routes: Routes = [
  {path: '',
  component:IntroComponent
  },
  {path: 'detail',
  component: DetailPersonaComponent
  },
  {path: 'table',
  component:TablePersonaComponent
  },
  {path: 'form',
  component:FormPersonaComponent
  },
  {path: 'modal',
  component:ModalComponent,
  canActivate:[CheckViewGuard],
  data:{}
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
