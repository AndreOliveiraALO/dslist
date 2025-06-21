package com.example.dslist.dto;

import com.example.dslist.entities.GameList;

public class GameListDTO {

    public Long id;

    public String nome;

    public GameListDTO(){}

    public GameListDTO(GameList entity){
        this.id = entity.getId();
        this.nome = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    
}
