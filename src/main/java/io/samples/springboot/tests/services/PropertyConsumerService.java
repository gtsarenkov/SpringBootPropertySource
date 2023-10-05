package io.samples.springboot.tests.services;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Getter
@Service
public class PropertyConsumerService {
  @Value("${property.placeholder}")
  private String propertyTest;
}
