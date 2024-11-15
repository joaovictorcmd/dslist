package com.joaovictorcmd.dslist.services;

import com.joaovictorcmd.dslist.dto.GameMinDTO;
import com.joaovictorcmd.dslist.entities.Game;
import com.joaovictorcmd.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author joaovictorcmd
 * @date 2024 Nov 15
 */
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> games = gameRepository.findAll();
        return games.stream().map(GameMinDTO::new).toList();
    }
}
