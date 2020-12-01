import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import { ConvertNumberServiceService } from '../services/convert-number-service.service';
import { Result } from '../model/result';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {
  checkoutForm = new FormGroup({
    inputToConvert: new FormControl('',[
      Validators.required,
      Validators.pattern("^[0-9]*$")
    ])
  });
  results = [];
  constructor(
    private convertNumberServiceService: ConvertNumberServiceService
  ) {

  }

  ngOnInit(): void {
  }

  submitNumber(inpuValue: number): void {
    console.log('tlanca :'+inpuValue);
    var result = this.convertNumberServiceService.convertNumber(inpuValue).subscribe((convertedValue :Result)=> {
      this.results.push(convertedValue.result);
    });
    console.log(this.results);
  }

}
