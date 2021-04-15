package service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import model.Artist;
import model.Event;

public class EventManagementImpl implements EventManagement{
	
	public static HashMap<Integer, Event> eventsMap ; 
	
	public EventManagementImpl() {
		eventsMap = new HashMap<Integer, Event>();
	}

	public int addEvent(Event event) {
		int id = -1;
		/*int eventId = event.getId();
		if(eventId >= 0 && !eventsMap.containsKey(eventId)) {
			eventsMap.put(eventId, event);
			id = eventId;
		}*/
		return id;
	}

	public boolean deleteEvent(int id) {
		boolean removed = false ;
		if(eventsMap.containsKey(id)) {
			Event event = eventsMap.get(id);
			removed = eventsMap.remove(id, event);
		}
		return removed;
	}

	public Event getEvent(int id) {
		return eventsMap.get(id);
	}

	public Event[] getEventsByArea(String area) {
		ArrayList<Event> events = new ArrayList<Event>();
		for(Event event : eventsMap.values()){
			if(event.getArea().equals(area))
				events.add(event);
		}
		return (Event[])events.toArray();
	}

	public Event[] getEventsByArtist(Artist artist) {
		ArrayList<Event> events = new ArrayList<Event>();
		for(Event event : eventsMap.values()){
			if(event.getArtist().equals(artist))
				events.add(event);
		}
		return (Event[])events.toArray();	
	}

	public Event[] getAllEvents() {
		return (Event[])eventsMap.values().toArray();
	}

}
