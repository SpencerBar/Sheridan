import { TestBed } from '@angular/core/testing';

import { ExpressMongo } from './express-mongo';

describe('ExpressMongo', () => {
  let service: ExpressMongo;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ExpressMongo);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
