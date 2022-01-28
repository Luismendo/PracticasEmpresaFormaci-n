import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TablePersonaComponent } from './table-persona.component';

describe('TablePersonaComponent', () => {
  let component: TablePersonaComponent;
  let fixture: ComponentFixture<TablePersonaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TablePersonaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TablePersonaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
