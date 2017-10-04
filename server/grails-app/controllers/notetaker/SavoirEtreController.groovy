package notetaker


import grails.rest.*
import grails.converters.*

class SavoirEtreController {
	static responseFormats = ['json', 'xml']
    def savoirEtreService

    def save = {
        savoirEtreService.creerClient(params['nom'],params['lieu'])
    }

    def show = {
        if(params.id ){
            def c = savoirEtreService.rechercherSavoirEtreParId(params.id)
            if(c != null){
                render c as JSON
            }
        }
    }

    def index() {
        render savoirEtreService.rechercherSavoirsEtre() as JSON
    }
}
