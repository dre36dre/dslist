package devsuperior.dslist.dto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import devsuperior.dslist.dto.GameMinDTO;
import devsuperior.dslist.dto.services.GameService;
import devsuperior.dslist.entities.Game;

@RestController
@RequestMapping(value="/games")
public class GameController {
	@Autowired
	private GameService gameService;
	
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result= gameService.findAll() ;
				return result;
	}
	
}
