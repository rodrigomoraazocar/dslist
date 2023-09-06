package com.roro.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity //Indica que la clase Game será mapeado y se convierta en tabla en la BD
@Table(name = "tb_name") //Indica que se llame tb_name y no el nombre de la clase
public class Game {

	@Id       //Para indicar que el atributo id será el id de la base datos
	@GeneratedValue (strategy = GenerationType.IDENTITY) //Indica que se autoincrementará automaticamente el Id en la BD
	private Long id;
	private String title;
	
	@Column(name="game_year") //Indica que cambiamos el nombre de la columna para game_year, ya que "year" es una palabra reservada de postgresql 
	private Integer year;
	
	private String genre;
	private String platform;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;

	//Constructores
	public Game() {
      }

	public Game(Long id, String title, Integer year, String genre, String platform, String imgUrl,
			String shortDescription, String longDescription) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platform = platform;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	//Fin de los constructores
	
	
	//Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	

	
	//HashCode & Equals - será usado para comparar objetos si son iguales
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
