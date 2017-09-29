package notetaker

/**
 *
 * Classe qui représente l'ensemble des personnes proposant des missions
 * */
class Personne {

    String nom
    String prenom
    //Fonction de la personne au sein de son entreprise
    String fonction

    static hasMany = [missions : Mission]
    static belongsTo = [client : Client]
    static constraints = {
        client nullable:true
        missions nullable:true
    }
}
