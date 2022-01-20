import { Component, OnInit } from '@angular/core';
import {ViewChild} from '@angular/core';
import {MatTable} from '@angular/material/table';
import {MatDialog} from '@angular/material/dialog';
import { ModalComponent } from '../modal/modal.component';
import { Router } from '@angular/router';
import { FormsService } from '../forms.service';
import { zip } from 'rxjs';


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
  DateEnd: String;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {position: 0,
  name: 'Hydrogen',
  usuario: 'luis',
  emailC: 'gg@gmail',
  emailP: 'gg@gmail',
  city: 'malaga',
  url: '.com',
  DateInit: new Date().getUTCDate().toString() +"/"+ (new Date().getMonth()+1).toString() +"/"+new Date().getFullYear().toString(),
  act: true,
  DateEnd: "25/02/2022"},
  {position: 1,
  name: 'Hydrogen',
  usuario: 'Pepe',
  emailC: 'gg@gmail',
  emailP: 'gg@wee',
  city: 'LOOOOL',
  url: '.com',
  DateInit: new Date().getUTCDate().toString() +"/"+ (new Date().getMonth()+1).toString() +"/"+new Date().getFullYear().toString(),
  act: true,
  DateEnd: "25/02/2022"},
  {position: 2,
  name: 'Hydrogen',
  usuario: 'Migul',
  emailC: 'uynimki@gmail',
  emailP: 'gg@waeweew',
  city: 'AAAAAAAAAAAA',
  url: '.com',
  DateInit: new Date().getUTCDate().toString() +"/"+ (new Date().getMonth()+1).toString() +"/"+new Date().getFullYear().toString(),
  act: true,
  DateEnd: "25/02/2022"},
  {position: 3,
  name: 'Hydrogen',
  usuario: 'Juan',
  emailC: 'ds@dsfsf',
  emailP: 'sddsd@dsdssds',
  city: 'AJD)WF',
  url: '.com',
  DateInit: new Date().getUTCDate().toString() +"/"+ (new Date().getMonth()+1).toString() +"/"+new Date().getFullYear().toString(),
  act: true,
  DateEnd: "25/02/2022"},
];

@Component({
  selector: 'app-table-person',
  templateUrl: './table-person.component.html',
  styleUrls: ['./table-person.component.css']
})
export class TablePersonComponent implements OnInit {

  displayedColumns: string[] = ['position', 'name', 'usuario', 'emailC', 'emailP', 'city', 'url', 'DateInit', 'act', 'DateEnd','Button'];
  dataSource = ELEMENT_DATA;
  ELEMENT_DATA: any;

  @ViewChild(MatTable)
  table!: MatTable<PeriodicElement>;

  constructor(public dialog: MatDialog, private router: Router,private formsService: FormsService){    }
  
  openDialog(id: number) {
    let find: any = this.dataSource.find(x => x.position == id);
    if(this.dataSource.find(x => x.position==id) != null){
      
      this.dialog.open(ModalComponent, {
        data: { position: find.position, 
          name: find.name, 
          surname: find.usuario,
          emailC: find.emailC,
          emailP: find.emailP ,
          city: find.city,
          url: find.url,
          DateInit: find.DateInit,
          act: find.act,
          DateEnd: find.DateEnd
        }});
    }

  }

  ngOnInit(): void {
    let temp = this.formsService.getInfo();
    if(temp != null){
      let findID: any = this.dataSource.findIndex(x => x.position == temp.position);
      console.log(temp)
      console.log(temp.position)
      console.log(findID)
      this.dataSource[findID].name = temp.name;
      this.dataSource[findID].usuario = temp.usuario;
      this.dataSource[findID].emailC = temp.emailC;
      this.dataSource[findID].emailP = temp.emailP;
      this.dataSource[findID].city = temp.city;
      this.dataSource[findID].url = temp.namurle;
      this.dataSource[findID].DateInit = temp.DateInit;
      this.dataSource[findID].DateEnd = temp.DateEnd;
      this.dataSource[findID].act = temp.act;

      console.log("AAAAAAAAAA")


    }

  }


  Delete(id: number): void {
    let find: number = this.dataSource.findIndex(x => x.position == id);
    this.dataSource.splice(find,1);
    this.table.renderRows();
  }

  routerLink(id: number): void {
    
    let find: any = this.dataSource.find(x => x.position == id);
    let index: any = this.dataSource.findIndex(x => x.position == id);
    console.log(find);
    this.formsService.sendInfo(find);
    let url: string = 'formEdit/'+index
    this.router.navigateByUrl(url);
  }

}
