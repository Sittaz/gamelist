package com.devsuperior.gameslist.controllers;

import com.devsuperior.gameslist.dto.GameDTO;
import com.devsuperior.gameslist.dto.GameListDTO;
import com.devsuperior.gameslist.dto.GameMinDTO;
import com.devsuperior.gameslist.services.GameListService;
import com.devsuperior.gameslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
    public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}