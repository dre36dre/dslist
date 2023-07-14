package devsuperior.dslist.dto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import devsuperior.dslist.entities.Game;

public interface GameRepository   extends JpaRepository<Game, Long>{

}
