package com.asmprojetos.lojagame.repositories;

import com.asmprojetos.lojagame.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
