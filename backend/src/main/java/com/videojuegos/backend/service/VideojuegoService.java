package com.videojuegos.backend.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.videojuegos.backend.entity.Videojuego;
import com.videojuegos.backend.repository.VideojuegoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VideojuegoService {

    private final VideojuegoRepository repository;

    public List<Videojuego> listar() {
        return repository.findAll();
    }

    public Videojuego guardar(Videojuego videojuego) {
        return repository.save(videojuego);
    }

    public List<Videojuego> favoritos() {
        return repository.findByFavoritoTrue();
    }

    public List<Videojuego> porGenero(Long generoId) {
        return repository.findByGeneroId(generoId);
    }
}