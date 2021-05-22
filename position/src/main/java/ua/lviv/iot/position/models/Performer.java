package ua.lviv.iot.position.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.position.enums.FilmType;
import ua.lviv.iot.position.enums.Job;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true) 
public class Performer extends Position{
	private Integer numberOfPerformences;
	private Boolean popylarity;
	
	public Performer(String name, Integer age, Integer salery, Integer workingHours, Job job, FilmType filmType, Integer numberOfPerformences, Boolean popylarity) {
		super(name, age, salery, workingHours,  job, filmType);
		this.numberOfPerformences = numberOfPerformences;
		this.popylarity = popylarity;
	}
}
