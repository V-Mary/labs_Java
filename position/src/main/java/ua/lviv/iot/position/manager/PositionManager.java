package ua.lviv.iot.position.manager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.position.enums.FilmType;
import ua.lviv.iot.position.enums.Sort;
import ua.lviv.iot.position.models.Position;
import java.util.stream.Collectors;


@Data
@NoArgsConstructor
public class PositionManager {
	private List<Position> workers = new ArrayList<>();
	
	public void addWorker(Position worker) {
		this.workers.add(worker);
	}
		
	public List<Position> sortBySalery(final Sort salery) {
		if (salery == Sort.ASC) {
			workers.sort(Comparator.comparing(Position::getSalery));
		} else {
			workers.sort(Comparator.comparing(Position::getSalery).reversed());
		}
		return workers;
	}
	
	public List<Position> searchByFilmType(final FilmType filmType){
		return workers.stream().filter(item -> item.getFilmType().equals(filmType)).collect(Collectors.toList());
	}
	
	public void printList(final List<Position> workersList ) {
		workersList.forEach(System.out::println);
	}
		
}
