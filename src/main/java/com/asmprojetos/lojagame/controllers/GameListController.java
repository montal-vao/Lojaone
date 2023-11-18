package com.asmprojetos.lojagame.controllers;

import com.asmprojetos.lojagame.dto.GameDTO;
import com.asmprojetos.lojagame.dto.GameListDTO;
import com.asmprojetos.lojagame.dto.GameMinDTO;
import com.asmprojetos.lojagame.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

}
