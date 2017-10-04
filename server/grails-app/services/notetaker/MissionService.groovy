package notetaker

import grails.gorm.transactions.Transactional

@Transactional
class MissionService {

    def creerMission = {String intitule,String lieu,Personne p,List<Technos> t ->  def m = new Mission(intitule:intitule,lieu:lieu,personne:p,technos:t);
        if(!m.save()){
            m.errors.allErrors.each {
                println it
            }
        }
        return m
    }

    def rechercherMissionParId(String id){
        return Mission.findById(id)
    }

    def rechercherMissions(){
        return Mission.findAll()
    }
    //Recherche des missions en fonction des différentes technos passées en paramètres
    def rechercherMissionParTechnos(listTechnos) {
        def missionResult = []

        //A refaire pour transférer la rechercher de mission à la base de données et non plus au code Java
        for(Technos t : listTechnos){
            Mission.findAll().each{
                if (t in it.technos){
                    missionResult.add(it)
                }
            }
        }

                //missionResult = missionResult.addAll()
        println missionResult
        return missionResult
    }

    //Regarde si un élément est présent communement dans les deux listes
    private boolean unEltEnCommun(List<Technos> l1, List<Technos> l2){
        for (Technos t1 : l1){
            for (Technos t2 : l2){
                if (t1.nom.equals(t2.nom)){
                    return true;
                }
            }
        }
        return false
    }
}
