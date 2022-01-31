import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTable } from '@angular/material/table';
import { Router } from '@angular/router';
import { Personas } from '../personas-all-structures/mock-persona';
import { Persona } from '../personas-all-structures/persona';
import { PersonasService } from '../personas-all-structures/personas.service';

@Component({
  selector: 'app-table-persona',
  templateUrl: './table-persona.component.html',
  styleUrls: ['./table-persona.component.css']
})
export class TablePersonaComponent implements OnInit {

  arrPeronas: Persona[] = Personas;

  displayedColumns: string[] = ['position', 'name', 'usuario', 'emailC', 'emailP', 'city', 'url', 'DateInit', 'act', 'DateEnd','Button'];
  dataSource = this.arrPeronas;
  ELEMENT_DATA: any;

  @ViewChild(MatTable)
  table!: MatTable<Persona>;



  constructor(private personaService: PersonasService, private router: Router) { }

  ngOnInit(): void {
    this.personaService.getPersonas$().subscribe(peronas => {
        this.arrPeronas = peronas;
        this.dataSource = this.arrPeronas;
    });
    
  }

  Delete(id: number): void {
    this.personaService.deletePersona(id);
    /** 
    this.personaService.deletePersona(id).subscribe(data => {
      this.getUsers();
    });*/
    this.table.renderRows();
  }

  Add(): void {
    this.router.navigateByUrl('form');
  }
/*
  getUsers(): void {
    this.personaService.getPersonas$().subscribe(peronas => {
      this.arrPeronas = peronas;
      console.log(peronas)
      console.log(this.arrPeronas)
      this.dataSource = this.arrPeronas;
  });
  }*/

}
