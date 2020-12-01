import { TestBed } from '@angular/core/testing';

import { ConvertNumberServiceService } from './convert-number-service.service';

describe('ConvertNumberServiceService', () => {
  let service: ConvertNumberServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ConvertNumberServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
