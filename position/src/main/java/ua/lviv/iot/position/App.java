package ua.lviv.iot.position;

import ua.lviv.iot.position.enums.FilmType;
import ua.lviv.iot.position.enums.Job;
import ua.lviv.iot.position.enums.Sort;
import ua.lviv.iot.position.enums.Sport;
import ua.lviv.iot.position.manager.PositionManager;
import ua.lviv.iot.position.models.MainRole;
import ua.lviv.iot.position.models.Maker;
import ua.lviv.iot.position.models.Performer;
import ua.lviv.iot.position.models.Position;
import ua.lviv.iot.position.models.Technical;

public class App {
    public static void main(String[] args) {
    	PositionManager manager = new PositionManager();
    	
    	manager.addWorker(new Position("Ann", 20, 200, 25, Job.ACTORS, FilmType.ADVANTURE));
    	manager.addWorker(new Maker("Mary", 26, 80, 18, Job.DESIGNER, FilmType.ADVANTURE, 4, 4));
    	manager.addWorker(new Technical("Luka",30,790,10,Job.PRODUCER, FilmType.COMEDIES,4,4, "SKY"));
    	manager.addWorker(new MainRole("Andriy", 35, 3600, 12, Job.SCREENWRITER, FilmType.DRAMA, 11, true, false, Sport.ATHLETICS));
    	manager.addWorker(new Performer("Mark", 25, 1500, 7, Job.DIRECTOR, FilmType.HICTORICAL, 12, false));
    			
        System.out.println("Sort by salery: ");
    	manager.printList(manager.sortBySalery(Sort.DESC));
    	System.out.println("Search by film type: ");
    	manager.printList(manager.searchByFilmType(FilmType.ADVANTURE));
      }
}