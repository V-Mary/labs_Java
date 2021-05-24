package ua.lviv.iot.positionproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.positionproject.models.Position;
import ua.lviv.iot.positionproject.service.PositionService;

@RestController
@RequestMapping(path = "/position")
public class PositionController {
	
	@Autowired
	private PositionService positionService;
	
	@GetMapping(path = "/{id}")
	public Position getPosition(@PathVariable(name = "id") Integer id ) {
		return positionService.getPosition(id);
	}
	
	@GetMapping
	public List<Position> getPositions(){
		return positionService.getPositions();
	}
	
	
	@PutMapping
	public Position createPosition(@RequestBody Position position) {
		return positionService.addPosition(position);
	}
	
	@PostMapping
	public Position updatePosition(@RequestBody  Position position) {
		if (positionService.getPosition(position.getId()) != null) {
			return positionService.updatePosition(position);	
		} else {
			return null;
		}
	}

}
