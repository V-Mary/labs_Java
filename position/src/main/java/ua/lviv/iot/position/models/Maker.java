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

public class Maker extends Position {
	public Integer numberOfFilms;
	public Integer filmRating;
	
	public Maker(String name, Integer age, Integer salery, Integer workingHours, Job job, FilmType filmType, Integer numberOfFilms, Integer filmRating) {
		super(name, age, salery, workingHours, job, filmType);
		this.numberOfFilms = numberOfFilms;
		this.filmRating = filmRating;
	}
}