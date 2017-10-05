import {Mission} from './Mission';

export class Personne {

    fonction: string;
    missions: Mission[];
    constructor(_fonction: string){
        this.fonction = _fonction;
    }
}