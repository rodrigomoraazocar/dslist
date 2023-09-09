package com.roro.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

	@EmbeddedId // Se ocupa para "Embeddar" de mi clase BelongingPk
	private BelongingPK id;
	private Integer position;

	
	//Constructores
	public Belonging() {

	}

	public Belonging(Game game, GameList list, Integer position) {

		id.setGame(game);
		id.setList(list);
		this.position = position;
	}
//Fin constructores


//Getters and Setters
	
	public BelongingPK getId() {
		return id;
	}

	public void setId(BelongingPK id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}


	
//Fin Getters and setters
	
	
	//Equals and Hashcode
	
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
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}	
	
	
}
