# Document de conception du projet *The Movie Advisors*

## :black_medium_square: But du Service Web
Le but de notre service web est d'enregistrer et fournir des informations pour les prochaines événements, que ce soit :
  * Par région.
  * Par artiste. 
  
Nous avons donc crée un  client pour consommer ce Service Web. 
Celui-ci doit afficher les événements triés par artiste et inclure sa nationalité récupérer à partir du Service Web.
Nous avons utilisé l'API de Spotify afin de récupérer les informations nécéssaires.

## :black_medium_square: Activités

### :black_medium_small_square: MainActivity
Notre classe **MainActivity** est l'élément principal de notre application. Celle-ci hérite de la classe **_AppCompatActivity_** et implémente l'interface **_MediaController.MediaPlayerControl_**.
Nous allons détailler les principales méthodes de cette classe.
* La procédure **_onRequestPermissionsResult()_** permet de demander la permission de lire le stockage externe. Ainsi, si la permission n'est pas déja accepté, une demande apparait au lancemement de l'application **MES Musics** demandant à l'utilisateur d'autorisé cette lecture. 

## :black_medium_square: Autres
Deux versions de ce fichier ont été réalisées :
* version française (readme_fr.md)
* version anglaise (readme_en.md)

De plus, ce fichier est plus lisible sur la plateforme GitHub :
  * Lien vers le référentiel du projet WS : https://github.com/Salma-Bch/theMovieAdvisorsWS.git
  * Lien vers le référentiel du projet RS : https://github.com/Mons-L/theMovieAdvisorsRS.git

## :black_medium_square: Auteurs
**_Projet réalisé par :_**
* **_Salma BENCHELKHA (salmabenchelkha@gmail.com)_**
* **_Mouncif LEKMITI (m.lekmiti@hotmail.com)_**
