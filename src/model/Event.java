package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Event est la classe de donnée d'un évènement.
 * 
 * @author Salma BENCHELKHA & Mouncif LEKMITI
 * @version 1.0
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event")
public class Event {
	@XmlElement(name = "id")
	private int id;
	@XmlElement(name = "name")
	private String name;
	@XmlElement(name = "date")
	private String date;
	@XmlElement(name = "area")
	private String area;
	@XmlElement(name = "artist")
	private Artist artist;
	
	/**
	 * Constructeur de la classe Event.
	 * 
	 * @param id
	 * @param name
	 * @param date
	 * @param area	 
	 * @param artist	 	 
	 *
	 */
	public Event(int id, String name, String date, String area, Artist artist) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.area = area;
		this.artist = artist;
	}
	
	public Event() {}
	
	/**
	 * Méthode permettant de récupérer l'id de l'évènement.
	 *  
	 * @return L'id de l'évènement (type int).
	 *
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Méthode permettant de modifier l'id de l'évènement.
	 *  
	 * @param id
	 *
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Méthode permettant de récupérer le nom de l'évènement.
	 *  
	 * @return L'id de l'évènement (type int).
	 *
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Méthode permettant de modifier le nom de l'évènement.
	 *  
	 * @param name
	 *
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Méthode permettant de récupérer la date de l'évènement.
	 *  
	 * @return La date de l'évènement (type String).
	 *
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * Méthode permettant de modifier la date de l'évènement.
	 *  
	 * @param date
	 *
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	/**
	 * Méthode permettant de récupérer la région de l'évènement.
	 *  
	 * @return La région de l'évènement (type String).
	 *
	 */
	public String getArea() {
		return area;
	}
	
	/**
	 * Méthode permettant de modifier la région de l'évènement.
	 *  
	 * @param area
	 *
	 */
	public void setArea(String area) {
		this.area = area;
	}
	
	/**
	 * Méthode permettant de récupérer l'artiste de l'évènement.
	 *  
	 * @return L'artiste de l'évènement (type Artiste).
	 *
	 */
	public Artist getArtist() {
		return artist;
	}
	
	/**
	 * Méthode permettant de modifier l'artiste de l'évènement.
	 *  
	 * @param artist
	 *
	 */
	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	/**
	 * Méthode permettant de récupérer toutes les informations de l'évènement.
	 *  
	 * @return  Toutes les informations de l'évènement (type String).
	 *
	 */
	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", date=" + date + ", area=" + area + ", artist=" + artist + "]";
	}
	
}
