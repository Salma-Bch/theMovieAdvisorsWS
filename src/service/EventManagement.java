package service;

import javax.jws.*;
import model.Artist;
import model.Event;

/**
 * EventManagement est l'interface du service d'un évènement.
 * 
 * @author Salma BENCHELKHA & Mouncif LEKMITI
 * @version 1.0
 *
 */
@WebService(name = "EventManagement",targetNamespace = "http://service/")
public interface EventManagement {
	
	/**
	 * Méthode permettant d'ajouter un évènement.
	 *  
	 * @param event
	 * @return L'id de l'évenement ajouté ou -1 en cas d'erreur.
	 *
	 */
	@WebMethod(operationName = "addEvent", action = "urn:AddEvent")
	@WebResult(name = "id")
	public int addEvent(@WebParam(name = "event") Event event);
	
	/**
	 * Méthode permettant de supprimer un évènement.
	 *  
	 * @param id
	 * @return Retourne "true" si l'évènement a été supprimer ou "false" en cas d'erreur.
	 *
	 */
	/*@WebMethod(operationName = "deleteEvent", action = "urn:DeleteEvent")
	@WebResult(name = "deleted")
	public boolean deleteEvent(@WebParam(name = "id") int id);
	*/
	
	/**
	 * Méthode permettant de récupérer les évènements à partir d'une région.
	 *  
	 * @param area
	 * @return Retourne un tableau d'évènement.
	 *
	 */
	@WebMethod(operationName = "getEventsByArea", action = "urn:GetEventsByArea")
	@WebResult(name = "event")
	public Event[] getEventsByArea(@WebParam(name = "area") String area);
	
	
	/**
	 * Méthode permettant de récupérer les évènements à partir d'un artiste.
	 *  
	 * @param artiste
	 * @return Retourne un tableau d'évènement.
	 *
	 */
	@WebMethod(operationName = "getEventsByArtist", action = "urn:GetEventsByArtist")
	@WebResult(name = "event")
	public Event[] getEventsByArtist(@WebParam(name = "artist") Artist artist);
	
	
	/**
	 * Méthode permettant de récupérer tout les évènements.
	 *  
	 * @return Retourne un tableau d'évènement.
	 *
	 */
	@WebMethod(operationName = "getAllEvents", action = "urn:GetAllEvents")
	@WebResult(name = "events")
	public Event[] getAllEvents();

}
