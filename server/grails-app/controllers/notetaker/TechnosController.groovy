package notetaker


import grails.rest.*
import grails.converters.*

class TechnosController {
	static responseFormats = ['json', 'xml']
    def technosService

    def save = {
        technosService.creerClient(params['nom'],params['lieu'])
    }

    def show = {
        if(params.id ){
            def c = Technos.findById(params.id)
            if(c != null){
                render c as JSON
            }
        }
    }

    def index() {
        List<Technos> listTechnos = new ArrayList<Technos>();
        Technos.findAll().each { listTechnos.add(it)}
        render listTechnos as JSON
    }
}
