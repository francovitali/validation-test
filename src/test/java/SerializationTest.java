import com.fasterxml.jackson.databind.ObjectMapper;
import model.Person;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by fvitali on 1/3/17.
 */
public class SerializationTest {
	private static ObjectMapper objectMapper;

	@BeforeClass
	public static void setUp() {
		objectMapper = new ObjectMapper();
	}

	@Test
	public void testSerialization_WithValidModel_ShouldHaveNoErrors() throws Exception {
		Person person = getPerson("person_valid");

		assertNotNull(person);
	}

	@Test
	public void testSerialization_WithInvalidModel_ShouldHaveNoErrors() throws Exception {
		Person person = getPerson("person_invalid");

		assertNotNull(person);
	}

	protected Person getPerson(String filename) throws Exception {
		File file = new File(this.getClass().getResource(filename + ".json").getFile());
		return objectMapper.readValue(file, Person.class);
	}
}
