import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SickInfoComponent } from './sick-info.component';

describe('SickInfoComponent', () => {
  let component: SickInfoComponent;
  let fixture: ComponentFixture<SickInfoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SickInfoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SickInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
