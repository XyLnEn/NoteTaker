package notetaker

import grails.gorm.transactions.Transactional

@Transactional
class SavoirEtreService {

    def creerSavoirEtre = {String qualite ->  def se = new SavoirEtre(qualite:qualite);
        if(!se.save()){
            se.errors.allErrors.each {
                println it
            }
        }
        return se
    }

    def rechercherSavoirEtreParId(String id){
        return SavoirEtre.findById(id)
    }

    def rechercherSavoirsEtre(){
        return SavoirEtre.findAll()
    }


}
