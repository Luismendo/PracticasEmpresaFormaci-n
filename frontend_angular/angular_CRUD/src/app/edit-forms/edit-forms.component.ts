import { Component, OnInit } from '@angular/core';
import { FormsService } from '../forms.service';
import { Router } from '@angular/router';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';


@Component({
  selector: 'app-edit-forms',
  templateUrl: './edit-forms.component.html',
  styleUrls: ['./edit-forms.component.css']
})
export class EditFormsComponent implements OnInit {

  constructor(private formsService: FormsService,
    private router: Router,
    private build: FormBuilder) {
      this.preform = this.formsService.getInfo();

      this.miform = this.build.group({
        position: this.preform.position,
        name: this.preform.usuario, 
        surname: this.preform.name,
        emailC: this.preform.emailC,
        emailP: this.preform.emailP ,
        city: this.preform.city,
        url: this.preform.url,
        DateInit: this.preform.DateInit,
        act: this.preform.act,
        DateEnd: this.preform.DateEnd,
      })

  }


  preform: any;

  miform: FormGroup;

  ngOnInit(): void {
    this.preform = this.formsService.getInfo();
  
  }

  onSubmit(value: any): void{
    console.log(this.miform.value);
    this.formsService.sendInfo(this.miform.value);
    let url: string = ''
    this.router.navigateByUrl(url);
  }

}
