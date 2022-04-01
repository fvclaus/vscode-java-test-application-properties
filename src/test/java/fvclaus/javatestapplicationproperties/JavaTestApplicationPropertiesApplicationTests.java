package fvclaus.javatestapplicationproperties;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


class SpringBootConfiguration {

}

@ContextConfiguration(classes = {SpringBootConfiguration.class})
@SpringBootTest
public class JavaTestApplicationPropertiesApplicationTests {

	@Value("${properties-location}")
	private String propertiesLocation;

	@Test
	void contextLoads() {

		assertThat(propertiesLocation, IsEqual.equalTo("test"));
	}

}
