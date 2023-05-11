package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/gamesList")
public class GameListController {

    @Autowired
    private GameListService service;

    @RequestMapping(value = {"", "/"})
    public List<GameListDTO> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
