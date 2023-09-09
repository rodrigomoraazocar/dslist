package com.roro.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roro.dslist.dto.GameMinDTO;
import com.roro.dslist.entities.Game;
import com.roro.dslist.repositories.GameRepository;

//La camada Servicio va a retornar un DTO

@Service // Sirve para indicar/REGISTRAR GameService para que el Framework Spring lo
			// administre
public class GameService {

	@Autowired // Inyección de dependencia - Inyectando el Componente GameRepository en GameService
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() { // Retornara una Lista de Juegos (Games)
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;

	}
 
}
