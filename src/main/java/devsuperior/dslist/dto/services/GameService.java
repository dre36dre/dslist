package devsuperior.dslist.dto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import devsuperior.dslist.dto.GameMinDTO;
import devsuperior.dslist.dto.repositories.GameRepository;
import devsuperior.dslist.entities.Game;

@Service
public class GameService {
	@Autowired
	GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
	List<Game> result=	gameRepository.findAll();
	List<GameMinDTO> dto=result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}

}
