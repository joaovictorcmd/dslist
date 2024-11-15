package com.joaovictorcmd.dslist.controllers;

import com.joaovictorcmd.dslist.dto.GameMinDTO;
import com.joaovictorcmd.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author joaovictorcmd
 * @date 2024 Nov 15
 */
@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }
}
