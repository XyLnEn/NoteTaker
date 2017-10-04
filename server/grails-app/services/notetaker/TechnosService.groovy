package notetaker

import grails.gorm.transactions.Transactional

@Transactional
class TechnosService {

    def creerTechnos = {String nom,int maitrise ->  def se = new Technos(nom:nom,maitrise:maitrise);
        if(!se.save()){
            se.errors.allErrors.each {
                println it
            }
        }
        return se
    }

    def rechercherTechnosParId(String id){
        return Technos.findById(id)
    }

    def rechercherTechnos(){
        return Technos.findAll()
    }
}
