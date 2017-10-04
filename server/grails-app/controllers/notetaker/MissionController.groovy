package notetaker


import grails.rest.*
import grails.converters.*




class MissionController {
    def missionService
	static responseFormats = ['json', 'xml']


    def save = {
        missionService.creerMission(request.JSON.intitule,request.JSON.lieu,request.JSON.personne)
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

        render missionService.rechercherMissions() as JSON
    }

    def missionParTechnos (listTechnos){
        return missionService.rechercherMissionsParTechnos(listTechnos)

    }

}
