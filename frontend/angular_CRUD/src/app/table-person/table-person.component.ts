import { Component, OnInit } from '@angular/core';
import { MatButton } from '@angular/material/button';



export interface PeriodicElement {
  name: string;
  position: number;
  usuario: string;
  emailC: string;
  emailP: string;
  city: string;
  url: string;
  DateInit: String;
  act: boolean;
  DateEnd: Date;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {position: 1, name: 'Hydrogen',
  usuario: 'luis',
  emailC: 'gg@gmail',
  emailP: 'gg@gmail',
  city: 'malaga',
  url: '.com',
  DateInit: new Date().getUTCDate().toString() +"/"+1+"/"+new Date().getFullYear().toString(),
  act: true,
  DateEnd: new Date()},
];

@Component({
  selector: 'app-table-person',
  templateUrl: './table-person.component.html',
  styleUrls: ['./table-person.component.css']
})
export class TablePersonComponent implements OnInit {

  displayedColumns: string[] = ['position', 'name', 'usuario', 'emailC', 'emailP', 'city', 'url', 'DateInit', 'act', 'DateEnd',];
  dataSource = ELEMENT_DATA;

  constructor(){}

  ngOnInit(): void {
  }

}
