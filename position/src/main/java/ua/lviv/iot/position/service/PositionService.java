package ua.lviv.iot.positionproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import ua.lviv.iot.positionproject.dal.PositionRepository;
import ua.lviv.iot.positionproject.exceptions.PositionNotFouldException;
import ua.lviv.iot.positionproject.models.Position;

@Service
@ApplicationScope
public class PositionService {

	@Autowired
	private PositionRepository repository;

	public Position addPosition(Position position) {

		return repository.save(position);

	}

	public Position updatePosition(Position position) {

		if (repository.existsById(position.getId())) {
			return repository.save(position);
		}
		
		throw new PositionNotFouldException("Position with id:" + position.getId() + "not found in the system.");
	}

	public List<Position> getPositions() {

		return repository.findAll();
	}

	public Position getPosition(Integer id) {

		return repository.findById(id).orElseThrow();
	}
}
