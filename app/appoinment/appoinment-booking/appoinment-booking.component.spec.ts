import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppoinmentBookingComponent } from './appoinment-booking.component';

describe('AppoinmentBookingComponent', () => {
  let component: AppoinmentBookingComponent;
  let fixture: ComponentFixture<AppoinmentBookingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppoinmentBookingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppoinmentBookingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
