import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';

import { Technos } from '../domaine/Technos';
//import { MISSIONS } from '../domaine/mission.mock';

import 'rxjs/add/operator/toPromise';
import 'rxjs/add/operator/map';

@Injectable()
export class TechnosService {

  private headers = new Headers({'Content-Type': 'application/json'});
  private technosUrl = 'http://localhost:8080/technos';  // URL to web api
  
  constructor(private http: Http) { }

  getTechnos(): Promise<Technos[]> {
  return this.http.get(this.technosUrl)
                .map(response => response.json())
                .toPromise()
               .catch(this.handleError);
  }
 
  private handleError(error: any): Promise<any> {
  console.error('An error occurred', error); // for demo purposes only
  return Promise.reject(error.message || error);
  }
}
