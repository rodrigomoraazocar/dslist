package com.roro.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//esta es una clase auxiliar ya que la "relacion es muchos muchos"
@Embeddable
public class BelongingPK {

	@ManyToOne     //Mapeamiento de las llaves extranjeras
	@JoinColumn(name="game_id")
	private Game game;
	
	@ManyToOne  //Mapeamiento de las llaves extranjeras
	@JoinColumn(name="list_id")
	private GameList list;

	
	//Constructores
	public BelongingPK() {
	}

	public BelongingPK(Game game, GameList list) {

		this.game = game;
		this.list = list;

	}
	
	//Fin Constructores

	//Getters and Setters
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getList() {
		return list;
	}

	public void setList(GameList list) {
		this.list = list;
	}

	

	//Fin Getters and Setters
	
	
	//Equals and Hashcode - debemos comparar en ambos 
	@Override
	public int hashCode() {
		return Objects.hash(game, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(list, other.list);
	}
	
	
	
	
}
