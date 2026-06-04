package com.videojuegos.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.videojuegos.backend.entity.Videojuego;


public interface VideojuegoRepository extends JpaRepository<Videojuego, Long> {

    List<Videojuego> findByFavoritoTrue();

    List<Videojuego> findByGeneroId(Long generoId);
}