package service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import model.Artist;
import model.Event;

/**
 * EventManagementImpl est la classe d'implémenation du service d'un évènement.
 * 
 * @author Salma BENCHELKHA & Mouncif LEKMITI
 * @version 1.0
 *
 */
@WebService(targetNamespace = "http://service/", portName = "EventManagementImplPort", serviceName = "EventManagementImplService")
public class EventManagementImpl implements EventManagement{
	
	public static HashMap<Integer, Event> EVENT_DATA ; 
	
	/**
	 * Constructeur de la classe EventManagementImpl. 
	 */
	public EventManagementImpl() {
		EVENT_DATA = new HashMap<Integer, Event>();
	}
	
	/**
	 * Méthode permettant d'ajouter un évènement.
	 *  
	 * @param event
	 * @return L'id de l'évenement ajouté ou -1 en cas d'erreur.
	 *
	 */

	@WebMethod(operationName = "addEvent", action = "urn:AddEvent")
	@WebResult(name = "return")
	public int addEvent(@WebParam(name = "arg0") Event event) {
		int id = 1;
		int eventId = event.getId();
		if(eventId >= 0 && !EVENT_DATA.containsKey(eventId)) {
			EVENT_DATA.put(eventId, event);
			id = eventId;
		}
		return id;
	}

	/**
	 * Méthode permettant de supprimer un évènement.
	 *  
	 * @param id
	 * @return Retourne "true" si l'évènement a été rajouter ou "false" en cas d'erreur.
	 *
	 */
	/*
	public boolean deleteEvent(int id) {
		boolean removed = false ;
		if(eventsMap.containsKey(id)) {
			Event event = eventsMap.get(id);
			removed = eventsMap.remove(id, event);
		}
		return removed;
	}
	*/
	
	/**
	 * Méthode permettant de récupérer les évènements à partir d'une région.
	 *  
	 * @param area
	 * @return Retourne un tableau d'évènement.
	 *
	 */
	@WebMethod(operationName = "getEventsByArea", action = "urn:GetEventsByArea")
	@WebResult(name = "return")
	public Event[] getEventsByArea(@WebParam(name = "arg0") String area) {	
		ArrayList<Event> events = new ArrayList<Event>();
		for(Event event : EVENT_DATA.values()){
			if(event.getArea().equals(area))
				events.add(event);
		}
		return events.toArray(new Event[events.size()]);
	}
	

	/**
	 * Méthode permettant de récupérer les évènements à partir d'un artiste.
	 *  
	 * @param artiste
	 * @return Retourne un tableau d'évènement.
	 *
	 */
	@WebMethod(operationName = "getEventsByArtist", action = "urn:GetEventsByArtist")
	@WebResult(name = "return")
	public Event[] getEventsByArtist(@WebParam(name = "arg0") Artist artist) {
		ArrayList<Event> events = new ArrayList<Event>();
		int id = artist.getId();
		for(Event event : EVENT_DATA.values()){
			Artist currentArtist = event.getArtist();
			if(currentArtist.getId() == id && currentArtist.getName().equals(artist.getName())
					&& currentArtist.getNationality().equals(artist.getNationality())) {
				events.add(event);
			}
		}
		return events.toArray(new Event[events.size()]);
	}
	
	
	/**
	 * Méthode permettant de récupérer tout les évènements.
	 *  
	 * @return Retourne un tableau d'évènement.
	 *
	 */
	
	@WebMethod(operationName = "getAllEvents", action = "urn:GetAllEvents")
	@WebResult(name = "return")
	public Event[] getAllEvents() {
		return EVENT_DATA.values().toArray(new Event[EVENT_DATA.values().size()]);
	}
		
}
