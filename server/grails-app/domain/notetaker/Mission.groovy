package notetaker

class Mission {

    String intitule
    //Lieu ou se déroule la mission (changer type ?)
    String lieu
    //Date du début de la mission
    Date dateDeb
    //Date à laquelle la mission a été proposée
    Date dateProp = new Date()
    static belongsTo = [personne : Personne]
    static hasMany = [technos : Technos]
    static constraints = {

        dateDeb nullable:true

    }
}
