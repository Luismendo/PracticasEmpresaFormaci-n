import { Component, OnInit } from '@angular/core';
import { PersonasService } from '../personas-all-structures/personas.service';
import { Router } from '@angular/router';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-form-persona',
  templateUrl: './form-persona.component.html',
  styleUrls: ['./form-persona.component.css']
})
export class FormPersonaComponent implements OnInit {
  preform: any;

  miform: FormGroup;

  constructor(private personaService: PersonasService,
    private router: Router,
    private build: FormBuilder) {
        this.preform = this.personaService.getPreEditPersona();

        if(this.preform == undefined){
          this.miform = this.build.group({
            position: '',
            name: '', 
            usuario: '',
            emailC: '',
            emailP: '',
            city: '',
            url: '',
            DateInit:  '',
            act: false,
            DateEnd:  '',
          })
        }else{
          this.miform = this.build.group({
            position: this.preform.position,
            name: this.preform.name, 
            usuario: this.preform.usuario,
            emailC: this.preform.emailC,
            emailP: this.preform.emailP,
            city: this.preform.city,
            url: this.preform.url,
            DateInit:  this.preform.DateInit,
            act: this.preform.act,
            DateEnd:  this.preform.DateEnd,
          })
          
        }



  }

  ngOnInit(): void {
  }

  onSubmit(): void{
    if(this.preform == undefined){
      console.log(this.miform.value);
      this.personaService.addPersona(this.miform.value);
      this.router.navigateByUrl('table');
    }else{
      console.log(this.miform.value);
      this.personaService.editPersona(this.miform.value);
      this.router.navigateByUrl('table');
    }

  }

}
