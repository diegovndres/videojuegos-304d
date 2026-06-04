package com.videojuegos.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videojuegos.backend.entity.Videojuego;
import com.videojuegos.backend.service.VideojuegoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/videojuegos")
@RequiredArgsConstructor
@CrossOrigin("*")
public class VideojuegoController {

    private final VideojuegoService service;

    @GetMapping
    public List<Videojuego> listar() {
        return service.listar();
    }

    @PostMapping
    public Videojuego guardar(@RequestBody Videojuego videojuego) {
        return service.guardar(videojuego);
    }

    @GetMapping("/favoritos")
    public List<Videojuego> favoritos() {
        return service.favoritos();
    }

    @GetMapping("/genero/{id}")
    public List<Videojuego> porGenero(@PathVariable Long id) {
        return service.porGenero(id);
    }
}