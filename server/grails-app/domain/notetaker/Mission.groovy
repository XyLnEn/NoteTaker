package notetaker

class Mission {

    String intitule
    //Lieu ou se déroule la mission (changer type ?)
    String lieu
    //Date du début de la mission
    Date dateDeb
    //Date à laquelle la mission a été proposée
    Date dateProp = new Date()
    //Une mission appartiens a une personne
    static belongsTo = [personne : Personne]
    //une mission est composé de plusieurs
    static hasMany = [technos : Technos]

    static mapping = {
        personne lazy:false
        technos lazy:false
    }
    static constraints = {

        dateDeb nullable:true

    }
}
