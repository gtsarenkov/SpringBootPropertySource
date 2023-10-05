package io.samples.springboot.tests;

import io.samples.springboot.tests.services.PropertyConsumerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class SpringBootPropertySourceApplicationTests {

  @Autowired
  private PropertyConsumerService propertyConsumer;

  @Test
  void contextLoads () {
    Assertions.assertEquals ("test", propertyConsumer.getPropertyTest ());
  }

}
