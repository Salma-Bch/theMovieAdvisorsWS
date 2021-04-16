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
 
## :black_medium_square: Contenu du fichier WSDL
<?xml version="1.0" encoding="UTF-8"?>
<wsdl:definitions name="EventManagementImplService" targetNamespace="http://service/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="http://service/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/">
  <wsdl:types>
    <schema xmlns="http://www.w3.org/2001/XMLSchema">
  <import namespace="http://service/" schemaLocation="eventmanagementimpl_schema1.xsd"/>
</schema>
  </wsdl:types>
  <wsdl:message name="addEventResponse">
    <wsdl:part name="parameters" element="tns:addEventResponse">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="getEventsByArea">
    <wsdl:part name="parameters" element="tns:getEventsByArea">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="addEvent">
    <wsdl:part name="parameters" element="tns:addEvent">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="getAllEventsResponse">
    <wsdl:part name="parameters" element="tns:getAllEventsResponse">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="getEventsByAreaResponse">
    <wsdl:part name="parameters" element="tns:getEventsByAreaResponse">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="getAllEvents">
    <wsdl:part name="parameters" element="tns:getAllEvents">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="getEventsByArtistResponse">
    <wsdl:part name="parameters" element="tns:getEventsByArtistResponse">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="getEventsByArtist">
    <wsdl:part name="parameters" element="tns:getEventsByArtist">
    </wsdl:part>
  </wsdl:message>
  <wsdl:portType name="EventManagement">
    <wsdl:operation name="getAllEvents">
      <wsdl:input name="getAllEvents" message="tns:getAllEvents">
    </wsdl:input>
      <wsdl:output name="getAllEventsResponse" message="tns:getAllEventsResponse">
    </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="getEventsByArea">
      <wsdl:input name="getEventsByArea" message="tns:getEventsByArea">
    </wsdl:input>
      <wsdl:output name="getEventsByAreaResponse" message="tns:getEventsByAreaResponse">
    </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="getEventsByArtist">
      <wsdl:input name="getEventsByArtist" message="tns:getEventsByArtist">
    </wsdl:input>
      <wsdl:output name="getEventsByArtistResponse" message="tns:getEventsByArtistResponse">
    </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="addEvent">
      <wsdl:input name="addEvent" message="tns:addEvent">
    </wsdl:input>
      <wsdl:output name="addEventResponse" message="tns:addEventResponse">
    </wsdl:output>
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="EventManagementImplServiceSoapBinding" type="tns:EventManagement">
    <soap:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
    <wsdl:operation name="getAllEvents">
      <soap:operation soapAction="urn:GetAllEvents" style="document"/>
      <wsdl:input name="getAllEvents">
        <soap:body use="literal"/>
      </wsdl:input>
      <wsdl:output name="getAllEventsResponse">
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="getEventsByArea">
      <soap:operation soapAction="urn:GetEventsByArea" style="document"/>
      <wsdl:input name="getEventsByArea">
        <soap:body use="literal"/>
      </wsdl:input>
      <wsdl:output name="getEventsByAreaResponse">
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="getEventsByArtist">
      <soap:operation soapAction="urn:GetEventsByArtist" style="document"/>
      <wsdl:input name="getEventsByArtist">
        <soap:body use="literal"/>
      </wsdl:input>
      <wsdl:output name="getEventsByArtistResponse">
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="addEvent">
      <soap:operation soapAction="urn:AddEvent" style="document"/>
      <wsdl:input name="addEvent">
        <soap:body use="literal"/>
      </wsdl:input>
      <wsdl:output name="addEventResponse">
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="EventManagementImplService">
    <wsdl:port name="EventManagementImplPort" binding="tns:EventManagementImplServiceSoapBinding">
      <soap:address location="http://localhost:8080/theMovieAdvisorsWS/services/EventManagementImplPort"/>
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>


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

