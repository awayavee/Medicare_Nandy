import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppoinmentHistoryComponent } from './appoinment-history.component';

describe('AppoinmentHistoryComponent', () => {
  let component: AppoinmentHistoryComponent;
  let fixture: ComponentFixture<AppoinmentHistoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppoinmentHistoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppoinmentHistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
