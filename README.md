# NoteTaker

Projet fonctionnant avec Java 8 et Angular ?

Installation :
- Grails : installer grails https://grails.org/download.html
- Groovy : http://groovy-lang.org/download.html
- Angular avec npm et nodejs : https://nodejs.org/en/download/

Importer le projet depuis github : /*lien github*/

Pour lancer le front (client) : gradlew client:bootRun
Pour lancer le back (server) : gradlew server:bootRun
Pour lancer les deux en parallèle : gradlew bootRun --parallel


//********************************************************************************************************************************

Structure générale :
    Server :

Domain :
    -Client :Correspondant à une entrise ou un service de l'entrise par exemple)
    -Personne :Correspond à la personne qui va proposer la mission)
    -Mission :Correspond à la mission proposé par une personne contenant un ensemble de technos à maitriser
    -Technos :Correspond à une technos spécifique ainsi que sont degré de maitrise.
    -SavoirEtre: Correspond au savoir-être d'un personne (classe par vraiment utilisé pour le moment par manque d'info)

Chaque domain à un service associé avec des méthodes d'insertion en base, de recherche etc...
Chaque service est apellée par le controller correspondant, c'est celui-ci qui va transmettre et récupérer les différentes informations du client (front).


    Client:
Nav correspond à la barre de navigation présente sur l'écran d'acueille.
On peut ainsi accéder à:
    - browse qui va afficher toutes les missions disponibles.
    - match qui correspond au matching entre des technos rentrées par l'utilisateur et des missions stockées en base.
    - note qui est l'écran de prise de note des missions proposées.

Il y a également les mêmes classes domain que dans le back ainsi que deux services, celui des missions et celui des technos.

//*******************************************************************************************************************************

Pistes d'amélioration :
    Améliorer la façon dont le matching est fait (pour l'instant simple comparaison entre les noms des technos sans prise en compte de la maitrise).
    Changement de la base de données (pour l'instant utilisation d'une base temporaire fournis avec grails)

    Amélioration de l'ésthétique (pourquoi pas avec bootsrap).
