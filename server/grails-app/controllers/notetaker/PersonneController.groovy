package notetaker


import grails.rest.*
import grails.converters.*

class PersonneController {
	static responseFormats = ['json', 'xml']
    def personneService
    def save = {
        personneService.creerPersonne(params['nom'],params['prenom'],params['fonction'])
    }

    def show = {
        if(params.id ){
            def p = personneService.rechercherPersonneParId(params.id)
            if(p != null){
                render p as JSON
            }
        }
    }

    def index() {
        render personneService.rechercherPersonnes() as JSON
    }

}
