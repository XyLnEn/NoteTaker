package notetaker


import grails.rest.*
import grails.converters.*




class MissionController {
    def missionService
	static responseFormats = ['json', 'xml']


    def save = {
        missionService.creerMission(params['intitule'],params['lieu'],params['personne'])
    }

    def show = {
        if(params.id ){
            def m = missionService.rechercherMissionParId(params.id)
            if(m != null){
                render m as JSON
            }
        }
    }

    def index() {
      //configuration qui fair remonter tout les sous-objets de l'objet a remonter en même temps
      JSON.use('deep')
      render missionService.rechercherMissions() as JSON
    }

    def missionParTechnos (listTechnos){
        return missionService.rechercherMissionsParTechnos(listTechnos)

    }

}
