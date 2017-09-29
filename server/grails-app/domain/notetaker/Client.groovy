package notetaker

class Client {

    String nom
    //Localisation du client (changer de type ?)
    String lieu
    //Un client possède plusieurs personnes travaillant pour lui
    static hasMany = [personnes : Personne]

    static constraints = {
        //Pour un même lieu le nom doit être différent
        nom unique: 'lieu'
    }
}
