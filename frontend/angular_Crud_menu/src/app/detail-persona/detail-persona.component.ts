import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Persona } from '../persona';
import { PersonasService } from '../personas.service';

@Component({
  selector: 'app-detail-persona',
  templateUrl: './detail-persona.component.html',
  styleUrls: ['./detail-persona.component.css']
})
export class DetailPersonaComponent implements OnInit {
  arrPeronas: Persona[] = this.personaService.getPersonas();
  
  constructor(private personaService: PersonasService,
    private router: Router) { }

  ngOnInit(): void {
      this.personaService.getPersonas$().subscribe(peronas => {
        this.arrPeronas = peronas;
    });
  }

  
  Delete(id: number): void {
    this.personaService.deletePersona(id);
  }

  Editar(id: number): void {
    this.personaService.PreEditPersona(this.arrPeronas[id]);
    this.router.navigateByUrl('form');
  }

}
