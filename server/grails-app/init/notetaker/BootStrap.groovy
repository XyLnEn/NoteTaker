package notetaker

import org.springframework.beans.factory.annotation.Autowired


class BootStrap {

    def clientService
    def missionService
    def personneService
    def technosService
    def savoirEtreService
    def init = { servletContext ->
        Personne p = personneService.creerPersonne("NomTest1","PrenomTest1","FonctionTest1")
        clientService.creerClient("testNom2","testLieu2")
        clientService.creerClient("testNom3","testLieu3")
        Technos t = technosService.creerTechnos("testNom1",1)
        Technos t2 = technosService.creerTechnos("testNom2",2)
        missionService.creerMission("testIntitule1","testLieu1",p,Arrays.asList(t,t2))
        savoirEtreService.creerSavoirEtre("testQualite1")
        def m = missionService.rechercherMissionParTechnos([t])

    }
    def destroy = {
    }
}
