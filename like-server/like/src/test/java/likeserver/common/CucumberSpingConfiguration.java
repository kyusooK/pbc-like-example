package likeserver.common;

import io.cucumber.spring.CucumberContextConfiguration;
import likeserver.LikeApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { LikeApplication.class })
public class CucumberSpingConfiguration {}
