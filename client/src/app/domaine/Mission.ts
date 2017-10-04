import {Personne} from './Personne';
import {Technos} from './Technos';

export class Mission {
  dateProp: Date;
  personne: Personne;
  intitule: string;
  technos: Technos[];
  dateDeb: Date;
  lieu: string;
}
