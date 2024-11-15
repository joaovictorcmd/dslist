package com.joaovictorcmd.dslist.repositories;

import com.joaovictorcmd.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author joaovictorcmd
 * @date 2024 Nov 15
 */
public interface GameRepository extends JpaRepository<Game, Long> {
}
