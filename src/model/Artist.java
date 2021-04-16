package model;

/**
 * Artist est la classe de donnée d'un artiste.
 * 
 * @author Salma BENCHELKHA & Mouncif LEKMITI
 * @version 1.0
 *
 */
public class Artist {
	private int id;
	private String name;
	private String nationality;
	
	/**
	 * Constructeur de la classe Artist.
	 * 
	 * @param id
	 * @param name
	 * @param nationality	 
	 *
	 */
	public Artist(int id, String name, String nationality) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
	}
	
	/**
	 * Méthode permettant de récupérer l'id de l'artiste.
	 *  
	 * @return L'id de l'artiste (type int).
	 *
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Méthode permettant de modifier l'id de l'artiste.
	 *  
	 * @param id
	 *
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Méthode permettant de récupérer le nom de l'artiste.
	 *  
	 * @return le nom de l'artiste (type String).
	 *
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Méthode permettant de modifier le nom de l'artiste.
	 *  
	 * @param name
	 *
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Méthode permettant de récupérer la nationalité de l'artiste.
	 *  
	 * @return  La nationalité de l'artiste (type String).
	 *
	 */
	public String getNationality() {
		return nationality;
	}
	
	/**
	 * Méthode permettant de modifier la nationalité de l'artiste.
	 *  
	 * @param name
	 *
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * Méthode permettant de récupérer toutes les informations de l'artiste.
	 *  
	 * @return  Toutes les informations de l'artiste (type String).
	 *
	 */
	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + ", nationality=" + nationality + "]";
	}
	
}
