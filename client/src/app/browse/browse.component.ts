import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
//Pour les tests
import {TechnosService} from '../service/technos.service';

import { MissionService } from '../service/mission.service';
//Pour les tests
import { Technos } from '../domaine/Technos';

import { Mission } from '../domaine/Mission';

@Component({
  selector: 'browser',
  templateUrl: './browse.component.html'
})
export class BrowseComponent implements OnInit {
  missions: Mission[];
  //Pour les tests
  technos: Technos[];
  constructor(
    private missionService: MissionService,
    private technosService: TechnosService,
    private router: Router) { }

  ngOnInit(): void {
    this.missionService
        .getMissions()
        .then(missions => {
          this.missions = missions;
        }, error => console.error('erreur lors de la recuperation des missions'));
  
    this.technosService
        .getTechnos()
        .then(technos => {
          this.technos = technos;
        }, error => console.error('erreur lors de la recuperation des technos') );
        
  }

}
