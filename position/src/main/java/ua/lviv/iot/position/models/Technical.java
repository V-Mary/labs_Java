package ua.lviv.iot.position.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.position.enums.FilmType;
import ua.lviv.iot.position.enums.Job;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@ToString(callSuper = true) 
public class Technical extends Maker {
	private String equipment;
	
	public Technical(String name, Integer age, Integer salery, Integer workingHours, Job job, FilmType filmType, Integer numberOfFilms, Integer filmRating, String equipment) {
		super(name, age, salery, workingHours, job, filmType, numberOfFilms, filmRating);
		this.equipment = equipment;
	}
}
