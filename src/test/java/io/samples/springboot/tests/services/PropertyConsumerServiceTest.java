package io.samples.springboot.tests.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith (SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
class PropertyConsumerServiceTest {
  @Autowired
  private PropertyConsumerService propertyConsumer;

  @Test
  void testPropertyPlaceholder () {
    Assertions.assertEquals ("test", propertyConsumer.getPropertyTest ());
  }

}