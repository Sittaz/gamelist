package com.devsuperior.gameslist.controllers;

import com.devsuperior.gameslist.services.GameService;
import com.devsuperior.gameslist.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/games")
    public class GameControllers {

    private GameService gameService;

    @GetMapping
    public List<Game> findAll(){
        List<Game> result = gameService.findAll();
        return result;

    }
}
