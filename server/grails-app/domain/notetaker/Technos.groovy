package notetaker

class Technos {
    // Nom de la techno (exemple JEE oui AngularJS)
    String nom
    //Niveau de maitrise de la techno (de 1 à 5)
    int maitrise

    static constraints = {
        maitrise max:5,min:0
        nom unique:true
    }
}
