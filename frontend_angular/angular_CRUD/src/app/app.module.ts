import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { TablePersonComponent } from './table-person/table-person.component';

import {MatTableModule} from '@angular/material/table';
import {MatDialogModule} from '@angular/material/dialog';

import { ModalComponent } from './modal/modal.component';
import { EditFormsComponent } from './edit-forms/edit-forms.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';

@NgModule({
  declarations: [
    AppComponent,
    TablePersonComponent,
    ModalComponent,
    EditFormsComponent
  ]
  ,entryComponents: [
    ModalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    BrowserAnimationsModule,
    BrowserModule,

    MatInputModule,
    MatFormFieldModule,

    MatTableModule,
    MatDialogModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
