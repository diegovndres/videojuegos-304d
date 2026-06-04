package com.videojuegos.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideojuegoDTO {

    private Long id;

    private String titulo;

    private String plataforma;

    private Boolean favorito;

    private Long generoId;

    private String generoNombre;
}