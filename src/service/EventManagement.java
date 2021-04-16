package service;

import javax.jws.*;
import model.Artist;
import model.Event;

/**
 * EventManagement est l'interface du service d'un �v�nement.
 * 
 * @author Salma BENCHELKHA & Mouncif LEKMITI
 * @version 1.0
 *
 */
@WebService(name = "EventManagement",targetNamespace = "http://service/")
public interface EventManagement {
	
	/**
	 * M�thode permettant d'ajouter un �v�nement.
	 *  
	 * @param event
	 * @return L'id de l'�venement ajout� ou -1 en cas d'erreur.
	 *
	 */
	@WebMethod(operationName = "addEvent", action = "urn:AddEvent")
	@WebResult(name = "id")
	public int addEvent(@WebParam(name = "event") Event event);
	
	/**
	 * M�thode permettant de supprimer un �v�nement.
	 *  
	 * @param id
	 * @return Retourne "true" si l'�v�nement a �t� supprimer ou "false" en cas d'erreur.
	 *
	 */
	/*@WebMethod(operationName = "deleteEvent", action = "urn:DeleteEvent")
	@WebResult(name = "deleted")
	public boolean deleteEvent(@WebParam(name = "id") int id);
	*/
	
	/**
	 * M�thode permettant de r�cup�rer les �v�nements � partir d'une r�gion.
	 *  
	 * @param area
	 * @return Retourne un tableau d'�v�nement.
	 *
	 */
	@WebMethod(operationName = "getEventsByArea", action = "urn:GetEventsByArea")
	@WebResult(name = "event")
	public Event[] getEventsByArea(@WebParam(name = "area") String area);
	
	
	/**
	 * M�thode permettant de r�cup�rer les �v�nements � partir d'un artiste.
	 *  
	 * @param artiste
	 * @return Retourne un tableau d'�v�nement.
	 *
	 */
	@WebMethod(operationName = "getEventsByArtist", action = "urn:GetEventsByArtist")
	@WebResult(name = "event")
	public Event[] getEventsByArtist(@WebParam(name = "artist") Artist artist);
	
	
	/**
	 * M�thode permettant de r�cup�rer tout les �v�nements.
	 *  
	 * @return Retourne un tableau d'�v�nement.
	 *
	 */
	@WebMethod(operationName = "getAllEvents", action = "urn:GetAllEvents")
	@WebResult(name = "events")
	public Event[] getAllEvents();

}
