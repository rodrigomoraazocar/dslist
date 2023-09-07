package com.roro.dslist.dto;

import com.roro.dslist.entities.Game;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	//Constructores
	GameMinDTO() {

	}

	public GameMinDTO(Game entity) {

		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	//Fin constructores

	// Getters - solamente necesita de los getters
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

}
