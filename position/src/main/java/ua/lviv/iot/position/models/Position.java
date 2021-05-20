package ua.lviv.iot.position.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.position.enums.FilmType;
import ua.lviv.iot.position.enums.Job;

@Data
@NoArgsConstructor

public class Position {
	private String name;
	private Integer age;
	private Integer salery;
	public Integer workingHours;
	public Job job;
	public FilmType filmType;
	
	public Position (String name, Integer age, Integer salery, Integer workingHours, Job job, FilmType filmType) {
		this.name = name;
		this.age = age;
		this.salery = salery;
		this.workingHours = workingHours;
		this.job = job;
		this.filmType = filmType;
	}
}
