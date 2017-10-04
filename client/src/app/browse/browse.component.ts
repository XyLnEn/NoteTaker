import { Component, OnInit } from '@angular/core';
import { Router }            from '@angular/router';

import { MissionService } from '../service/mission.service';

import { Mission } from '../domaine/mission';

@Component({
  selector: 'browser',
  templateUrl: './browse.component.html'
})
export class BrowseComponent implements OnInit {
  missions: Mission[];

  constructor(
    private missionService: MissionService,
    private router: Router) { }

  ngOnInit(): void {
    this.missionService
        .getMissions()
        .then(missions => {
          this.missions = missions;
        }, error => console.error('erreur lors de la recuperation des missions'));
  }

}
