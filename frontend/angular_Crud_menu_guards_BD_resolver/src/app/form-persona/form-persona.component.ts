import { Component, OnInit } from '@angular/core';
import { PersonasService } from '../personas/personas.service';
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

        var finDate: String = ''

        

        if(this.preform == undefined){
          this.miform = this.build.group({
            position: '',
            name: '', 
            usuario: '',
            company_email: '',
            personal_email: '',
            city: '',
            imagen_url: '',
            created_date:  '',
            active: false,
            termination_date:  '',
          })
        }else{
          console.log(this.preform.termination_date)
          if(this.preform.termination_date != null)finDate = this.preform.termination_date.slice(0,10);
          
          this.miform = this.build.group({
            position: this.preform.position,
            name: this.preform.name, 
            usuario: this.preform.usuario,
            company_email: this.preform.company_email,
            personal_email: this.preform.personal_email,
            city: this.preform.city,
            imagen_url: this.preform.imagen_url,
            created_date:  this.preform.created_date.slice(0,10),
            active: this.preform.active,
            termination_date:  finDate,
          })
          
        }



  }

  ngOnInit(): void {
  }

  onSubmit(): void{
    if(this.preform == undefined){
      console.log(this.miform.value);
      this.personaService.addPersona(this.miform.value).subscribe((http: any) =>{
        console.log(http)
        
      });
      this.router.navigateByUrl('detail');
    }else{
      console.log(this.miform.value);
      this.personaService.editPersona(this.miform.value);
      this.router.navigateByUrl('detail');
    }

  }

}
