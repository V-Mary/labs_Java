package ua.lviv.iot.position.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.position.enums.FilmType;
import ua.lviv.iot.position.enums.Job;
import ua.lviv.iot.position.enums.Sport;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@ToString(callSuper = true) 
public class MainRole extends Performer{
	private Boolean abilityToSing;
	private Sport sportSkills;
	
	public MainRole (String name, Integer age, Integer salery, Integer workingHours, Job job, FilmType filmType, 
			Integer numberOfPerformences, Boolean popylarity, Boolean abilityToSing, Sport sportSkills) {
		super(name, age, salery, workingHours, job,  filmType, numberOfPerformences, popylarity);
		this.abilityToSing = abilityToSing;
		this.sportSkills = sportSkills;
	}

}
