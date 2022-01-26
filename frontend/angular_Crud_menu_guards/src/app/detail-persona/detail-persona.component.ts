import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { ModalComponent } from '../modal/modal.component';
import { Persona } from '../persona';
import { PersonasService } from '../personas.service';

@Component({
  selector: 'app-detail-persona',
  templateUrl: './detail-persona.component.html',
  styleUrls: ['./detail-persona.component.css']
})
export class DetailPersonaComponent implements OnInit {
  arrPeronas: Persona[] = this.personaService.getPersonas();
  verDetalle = false;
  
  
  constructor(private personaService: PersonasService,
    private router: Router,
    public dialog: MatDialog) { }

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

  openDialog(id: number) {
    let find: any = this.arrPeronas.find(x => x.position == id);
    if(this.arrPeronas.find(x => x.position==id) != null){



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

  cheack(){
      if(this.verDetalle == true){
        this.personaService.ischeack(this.verDetalle);
      }else{
        this.personaService.ischeack(this.verDetalle);
      }
  }

}
