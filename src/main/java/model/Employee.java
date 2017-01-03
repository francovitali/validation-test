package model;

import javax.validation.constraints.NotNull;

/**
 * Created by fvitali on 1/3/17.
 */
public class Employee extends Person {
	@NotNull
	public String departmentId;
}
