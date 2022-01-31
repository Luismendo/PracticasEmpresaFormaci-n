import { ErrorHandler, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LateralMenuComponent } from './lateral-menu/lateral-menu.component';
import { TablePersonaComponent } from './table-persona/table-persona.component';
import { DetailPersonaComponent } from './detail-persona/detail-persona.component';
import { FormPersonaComponent } from './form-persona/form-persona.component';

import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatNativeDateModule} from '@angular/material/core';
import {HttpClientModule} from '@angular/common/http';

import {MaterialExampleModule} from './material/material.module';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatTooltipModule} from '@angular/material/tooltip';
import { IntroComponent } from './intro/intro.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { ModalComponent } from './modal/modal.component';
import { InMemoryWebApiModule } from 'angular-in-memory-web-api';
import { User } from './persona';
import { PersonasService } from './personas.service';
import { UserData } from './bbdd.service';
import { ErrorComponent } from './error/error.component';
import { GlobalErrorHandlerService } from './global-error-handler.service';

@NgModule({
  declarations: [
    AppComponent,
    LateralMenuComponent,
    TablePersonaComponent,
    DetailPersonaComponent,
    FormPersonaComponent,
    IntroComponent,
    SidenavComponent,
    ModalComponent,
    ErrorComponent,
  ],entryComponents:[
    ModalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    MatNativeDateModule,
    HttpClientModule,
    MaterialExampleModule,
    InMemoryWebApiModule.forRoot(UserData)

  ],
  providers: [
    {provide: ErrorHandler, useClass: GlobalErrorHandlerService}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
