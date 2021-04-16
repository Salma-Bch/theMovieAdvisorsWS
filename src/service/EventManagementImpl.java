package service;

import java.util.HashMap;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
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
	
	public static HashMap<Integer, Event> eventsMap ; 
	
	/**
	 * Constructeur de la classe EventManagementImpl. 
	 */
	public EventManagementImpl() {
		eventsMap = new HashMap<Integer, Event>();
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
		if(eventId >= 0 && !eventsMap.containsKey(eventId)) {
			eventsMap.put(eventId, event);
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
	/*
	public Event[] getEventsByArea(String area) {
		ArrayList<Event> events = new ArrayList<Event>();
		for(Event event : eventsMap.values()){
			if(event.getArea().equals(area))
				events.add(event);
		}
		return (Event[])events.toArray();
	}
	*/

	/**
	 * Méthode permettant de récupérer les évènements à partir d'un artiste.
	 *  
	 * @param artiste
	 * @return Retourne un tableau d'évènement.
	 *
	 */
	/**
	public Event[] getEventsByArtist(Artist artist) {
		ArrayList<Event> events = new ArrayList<Event>();
		for(Event event : eventsMap.values()){
			if(event.getArtist().equals(artist))
				events.add(event);
		}
		return (Event[])events.toArray();	
	}
	*/
	
	/**
	 * Méthode permettant de récupérer tout les évènements.
	 *  
	 * @return Retourne un tableau d'évènement.
	 *
	 */
	/*
	public Event[] getAllEvents() {
		return (Event[])eventsMap.values().toArray();
	}
	*/
}
