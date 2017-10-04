package notetaker

import grails.gorm.transactions.Transactional

@Transactional
class PersonneService {


    def creerPersonne = {String nom,String prenom, String fonction ->  def p = new Personne(nom:nom,prenom:prenom,fonction:fonction);
        if(!p.save()){
            m.errors.allErrors.each {
                println it
            }
        }
        return p
    }

    def rechercherPersonneParId(String id){
        return Personne.findById(id)
    }

    def rechercherPersonnes(){
        return Personne.findAll()
    }
}
