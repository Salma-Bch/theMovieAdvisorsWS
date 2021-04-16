# Document de conception du projet *The Movie Advisors*

## :black_medium_square: Description du service
Le but de notre service web est d'enregistrer et fournir des informations pour les prochaines événements, que ce soit :
  * Par région.
  * Par artiste. 
  
Nous avons donc crée un  client pour consommer ce Service Web. 
Celui-ci doit afficher les événements triés par artiste et inclure sa nationalité récupérer à partir du Service Web.
Nous avons utilisé l'API de Spotify afin de récupérer les informations nécéssaires.

## :black_medium_square: Description du client
La description du client est disponible dans ce référentiel :
 * Lien vers le référentiel du projet WS (client) : https://github.com/Salma-Bch/TheMovieAdvisorsWSClient.git

## :black_medium_square: Démonstration des fonctionnalité de l'implémentation

### :black_medium_small_square: Classes de données
 * **_Artist_**
 
    Un artiste possède un id, un nom et une nationalité.
   
 * **_Event_**
 
    Une évènement possède un id, un nom, une date et une région.

### :black_medium_small_square: Services
 * **_EventManagement_**
 
    EventManagement est l'interface du service d'un évènement. Elle regroupe l'appel de toutes les méthodes permettant de manipuler un évènement.
   
 * **_EventManagementImpl_**
 
    EventManagementImpl est la classe d'implémenation du service d'un évènement. Elle regroupe l'implémentation de toutes les méthodes permettant de manipuler un évènement.
    
     Celle-ci contient les méthodes permettant :
    * D'ajouter un évènement.
    * De récupérer un évènement à partir d'une région
    * De récupérer un évènement à partir d'un artiste.
    * De récupérer tout les évènements.
    
## :black_medium_square: Autres
Voici les liens vers les autres référentiels sur la plateforme GitHub :
  * Lien vers le référentiel du projet WS : https://github.com/Salma-Bch/theMovieAdvisorsWS.git
  * Lien vers le référentiel du projet RS : https://github.com/Mons-L/theMovieAdvisorsRS.git
  * Lien vers le référentiel du projet WS (client) : https://github.com/Salma-Bch/TheMovieAdvisorsWSClient.git
  * Lien vers le référentiel du projet RS (client) : https://github.com/Salma-Bch/TheMovieAdvisorsRSClient.git

## :black_medium_square: Auteurs
**_Projet réalisé par :_**
* **_Salma BENCHELKHA (salmabenchelkha@gmail.com)_**
* **_Mouncif LEKMITI (m.lekmiti@hotmail.com)_**

