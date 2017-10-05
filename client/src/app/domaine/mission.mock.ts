
import { Mission } from '../domaine/Mission';
import { Personne } from '../domaine/Personne';
import { Technos } from '../domaine/Technos';

export const MISSIONS: Mission[] = [
 {'intitule': 'mission1', 'dateProp': new Date(), 'personne': new Personne('p1'),
      'technos': [new Technos('technos1', 2), new Technos('technos2', 3)], 'lieu': 'quelquepart' },
  {'intitule': 'mission2', 'dateProp': new Date(), 'personne': new Personne('p2'),
      'technos': [new Technos('technos3', 1), new Technos('technos4', 1)], 'lieu': 'quelquepartdautre' }
];

// export const MISSIONS: Mission[] = [];
// export const MISSION12: Mission = {'client': 'Barbie', 'technos': ['pas','le','temps','de','niaiser'] };
