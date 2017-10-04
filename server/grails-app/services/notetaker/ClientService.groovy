package notetaker

import grails.gorm.transactions.Transactional

@Transactional
class ClientService {

    def creerClient(String nom, String lieu){
        def c = new Client(nom:nom,lieu:lieu);

        if(!c.save()){
            c.errors.allErrors.each {
                println it
            }
        }

        return c
    }

    def rechercherClients(){
        return Client.findAll()
    }

    def rechercherClientParId(String id){
        return Client.findById(id)
    }

    def serviceMethod() {

    }
}
