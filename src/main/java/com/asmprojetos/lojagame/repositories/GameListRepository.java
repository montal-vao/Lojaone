package com.asmprojetos.lojagame.repositories;

import com.asmprojetos.lojagame.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
