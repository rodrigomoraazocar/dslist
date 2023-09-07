package com.roro.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roro.dslist.entities.Game;

//Repositorio = Es la camada de acceso a los datos (Base datos) - Retorna una Entitity


public interface GameRepository extends JpaRepository<Game, Long> {

}
