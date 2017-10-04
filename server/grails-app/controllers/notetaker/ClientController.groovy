package notetaker


import grails.converters.JSON
import grails.converters.XML

class ClientController {
    static responseFormats = ['json', 'xml']
    def clientService


    def save = {
        clientService.creerClient(request.JSON.nom,request.JSON.lieu)
    }

    def show = {
        if(params.id ){
            def c = clientService.rechercherClientParId(params.id)
            if(c != null){
                render c as JSON
            }
        }
    }

    def index() {

        render clientService.rechercherClients() as JSON
    }
}
