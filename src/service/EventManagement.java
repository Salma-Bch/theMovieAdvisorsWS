package service;

import javax.jws.*;
import model.Artist;
import model.Event;

@WebService(name = "EventManagement",targetNamespace = "http://service/")
public interface EventManagement {
		
	@WebMethod(operationName = "addEvent", action = "urn:AddEvent")
	@WebResult(name = "id")
	public int addEvent(@WebParam(name = "event") Event event);
	
	/*
	@WebMethod(operationName = "deleteEvent", action = "urn:DeleteEvent")
	@WebResult(name = "deleted")
	public boolean deleteEvent(@WebParam(name = "id") int id);
	
	@WebMethod(operationName = "getEventsByArea", action = "urn:GetEventsByArea")
	@WebResult(name = "event")
	public Event[] getEventsByArea(@WebParam(name = "area") String area);
	
	@WebMethod(operationName = "getEventsByArtist", action = "urn:GetEventsByArtist")
	@WebResult(name = "event")
	public Event[] getEventsByArtist(@WebParam(name = "artist") Artist artist);
	
	@WebMethod(operationName = "getAllEvents", action = "urn:GetAllEvents")
	@WebResult(name = "events")
	public Event[] getAllEvents();
	*/

}
