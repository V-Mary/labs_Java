package ua.lviv.iot.positionproject.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import ua.lviv.iot.positionproject.models.Position;

@Service
@ApplicationScope
public class PositionService {
	
	private AtomicInteger id = new AtomicInteger(0);
	private Map<Integer, Position> positionsMap = new HashMap<Integer, Position>();
	
	public Position addPosition(Position position) {
		Integer positionId = id.incrementAndGet();
		position.setId(positionId);
		positionsMap.put(positionId, position);
		return position;
	}
	
	public Position updatePosition(Position position) {
		return positionsMap.put(position.getId(), position);
	}

	public List<Position> getPositions(){
		return positionsMap.values().stream().collect(Collectors.toList());
	}

	public Position getPosition(Integer id) {
		return positionsMap.get(id);
	}
}
