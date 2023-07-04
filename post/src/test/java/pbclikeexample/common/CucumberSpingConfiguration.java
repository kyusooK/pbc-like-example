package pbclikeexample.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pbclikeexample.PostApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { PostApplication.class })
public class CucumberSpingConfiguration {}
