import { TestBed } from '@angular/core/testing';

import { CheckViewGuard } from './check-view.guard';

describe('CheckViewGuard', () => {
  let guard: CheckViewGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(CheckViewGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
