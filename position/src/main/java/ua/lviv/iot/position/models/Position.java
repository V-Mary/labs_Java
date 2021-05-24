package ua.lviv.iot.positionproject.models;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Position {
	private Integer id;
	private String name;
	private Integer age;
	private Integer salery;

}
