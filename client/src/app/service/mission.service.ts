import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';

import { Mission } from '../domaine/Mission';
import { MISSIONS } from '../domaine/mission.mock';

import 'rxjs/add/operator/toPromise';


@Injectable()
export class MissionService {

  private headers = new Headers({'Content-Type': 'application/json'});
  private missionUrl = 'http://localhost:8080/mission';  // URL to web api
  
  constructor(private http: Http) { }

  getMissions(): Promise<Mission[]> {
  return this.http.get(this.missionUrl)
                .toPromise()
                .then(response => response.json())
               .catch(this.handleError);
  }
  /*
  getMissions(): Promise<Mission[]> {
    return Promise.resolve(MISSIONS);
  }
*/
  private handleError(error: any): Promise<any> {
  console.error('An error occurred', error); // for demo purposes only
  return Promise.reject(error.message || error);
  }
}
