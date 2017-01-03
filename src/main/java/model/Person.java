package model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by fvitali on 1/3/17.
 */
public class Person {
	public long id;

	@NotNull
	public String name;

	@Min(18)
	public int age;
}
