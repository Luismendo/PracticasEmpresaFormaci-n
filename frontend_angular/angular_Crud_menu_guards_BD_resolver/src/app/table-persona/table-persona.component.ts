import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTable } from '@angular/material/table';
import { Router } from '@angular/router';
import { PersonaHttp } from '../personas/persona';
import { PersonasService } from '../personas/personas.service';

@Component({
  selector: 'app-table-persona',
  templateUrl: './table-persona.component.html',
  styleUrls: ['./table-persona.component.css']
})
export class TablePersonaComponent implements OnInit {

  arrPeronas: PersonaHttp[] = [];
  

  displayedColumns: string[] = ['position', 'name', 'usuario', 'emailC', 'emailP', 'city', 'url', 'DateInit', 'act', 'DateEnd','Button'];
  dataSource = this.arrPeronas;
  ELEMENT_DATA: any;

  @ViewChild(MatTable)
  table!: MatTable<PersonaHttp>;



  constructor(private personaService: PersonasService, private router: Router) { }

  ngOnInit(): void {

    this.personaService.getHttp().subscribe((http: any) =>{
      console.log(http)
      this.arrPeronas = http;
      this.dataSource = this.arrPeronas;
    });
    
  }

  Delete(id: number): void {
    this.personaService.deletePersona(id).subscribe((http: any) =>{
      console.log(http)
      this.getUsers();
      this.table.renderRows();
    });
  }

  Add(): void {
    this.router.navigateByUrl('form');
  }

  getUsers(): void {
    this.personaService.getHttp().subscribe((http: any) =>{
      console.log(http)
      this.arrPeronas = http;
      this.dataSource = this.arrPeronas;
    });
  }
  

}
