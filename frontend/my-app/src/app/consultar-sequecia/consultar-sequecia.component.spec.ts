import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultarSequeciaComponent } from './consultar-sequecia.component';

describe('ConsultarSequeciaComponent', () => {
  let component: ConsultarSequeciaComponent;
  let fixture: ComponentFixture<ConsultarSequeciaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultarSequeciaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultarSequeciaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
