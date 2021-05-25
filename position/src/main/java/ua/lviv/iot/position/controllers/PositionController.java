package ua.lviv.iot.positionproject.controllers;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.positionproject.exceptions.PositionNotFouldException;
import ua.lviv.iot.positionproject.models.Position;
import ua.lviv.iot.positionproject.service.PositionService;

@RestController
@RequestMapping(path = "/position")
public class PositionController {

	private static final Logger LOGGER = Logger.getLogger("ua.lviv.iot.positionproject.controllers.PositionController");

	@Autowired
	private PositionService positionService;

	@GetMapping(path = "/{id}")
	public ResponseEntity<Position> getPosition(@PathVariable(name = "id") Integer id) {
		try {
			return new ResponseEntity<Position>(positionService.getPosition(id), HttpStatus.OK);
		} catch (NoSuchElementException e) {
			LOGGER.severe("Can't update an order with non-existion id" + id);
			return new ResponseEntity<Position>(HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping
	public List<Position> getPositions() {
		return positionService.getPositions();
	}

	@PutMapping
	public ResponseEntity<Position> createPosition(@RequestBody Position position) {

		if (position.getId() == null) {
			return new ResponseEntity<Position>(positionService.addPosition(position), HttpStatus.OK);
		}
		LOGGER.severe("Tried to create an order with passed id. Position creation should not use external ids.");
		return new ResponseEntity<Position>(HttpStatus.BAD_REQUEST);
	}

	@PostMapping
	public ResponseEntity<Position> updatePosition(@RequestBody Position position) {
		
		if (position.getId() == null) {
			LOGGER.severe("Can't update position without id - null value passed instead of it.");
			return new ResponseEntity<Position>(HttpStatus.BAD_REQUEST);
		}
		
		try {
			return new ResponseEntity<Position>(positionService.updatePosition(position), HttpStatus.OK);
		} catch (PositionNotFouldException e) {
			LOGGER.severe("Can't update an order with non-existion id: " + position.getId());
			return new ResponseEntity<Position>(HttpStatus.NOT_FOUND);
		}

	}

}
