import { Component, OnInit} from '@angular/core';
import { NgForm,FormGroup,FormArray,FormBuilder,Validators } from '@angular/forms';

import { MissionService } from '../service/mission.service';

import { Mission } from '../domaine/mission';

@Component({
  selector: 'match',
  templateUrl: './match.component.html'
})
export class MatchComponent implements OnInit {

  addForm: FormGroup; // form group instance

  constructor(private formBuilder: FormBuilder) {}

      ngOnInit() {
          //    *** this is code for adding invoice details ***
           this.addForm = this.formBuilder.group({
              technologies: this.formBuilder.array([
                  this.initLink(),
              ])
          });
      }
      initLink() {
          return this.formBuilder.group({
              linkAddress: ['', Validators.required]
          });
      }
      addLink() {
          const control = < FormArray > this.addForm.controls['technologies'];
          control.push(this.initLink());
      }
      removeLink(i: number) {
          const control = < FormArray > this.addForm.controls['technologies'];
          control.removeAt(i);
      }

      onSubmit(f : NgForm) : void {
        console.log(f.value);
      }

}
