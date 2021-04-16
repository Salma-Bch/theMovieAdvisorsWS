package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Event est la classe de donn�e d'un �v�nement.
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
	 * M�thode permettant de r�cup�rer l'id de l'�v�nement.
	 *  
	 * @return L'id de l'�v�nement (type int).
	 *
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * M�thode permettant de modifier l'id de l'�v�nement.
	 *  
	 * @param id
	 *
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * M�thode permettant de r�cup�rer le nom de l'�v�nement.
	 *  
	 * @return L'id de l'�v�nement (type int).
	 *
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * M�thode permettant de modifier le nom de l'�v�nement.
	 *  
	 * @param name
	 *
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * M�thode permettant de r�cup�rer la date de l'�v�nement.
	 *  
	 * @return La date de l'�v�nement (type String).
	 *
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * M�thode permettant de modifier la date de l'�v�nement.
	 *  
	 * @param date
	 *
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	/**
	 * M�thode permettant de r�cup�rer la r�gion de l'�v�nement.
	 *  
	 * @return La r�gion de l'�v�nement (type String).
	 *
	 */
	public String getArea() {
		return area;
	}
	
	/**
	 * M�thode permettant de modifier la r�gion de l'�v�nement.
	 *  
	 * @param area
	 *
	 */
	public void setArea(String area) {
		this.area = area;
	}
	
	/**
	 * M�thode permettant de r�cup�rer l'artiste de l'�v�nement.
	 *  
	 * @return L'artiste de l'�v�nement (type Artiste).
	 *
	 */
	public Artist getArtist() {
		return artist;
	}
	
	/**
	 * M�thode permettant de modifier l'artiste de l'�v�nement.
	 *  
	 * @param artist
	 *
	 */
	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	/**
	 * M�thode permettant de r�cup�rer toutes les informations de l'�v�nement.
	 *  
	 * @return  Toutes les informations de l'�v�nement (type String).
	 *
	 */
	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", date=" + date + ", area=" + area + ", artist=" + artist + "]";
	}
	
}
