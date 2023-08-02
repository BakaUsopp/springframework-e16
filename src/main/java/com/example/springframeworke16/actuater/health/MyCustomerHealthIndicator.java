package com.example.springframeworke16.actuater.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.metrics.MetricsEndpoint;
import org.springframework.stereotype.Component;

@Component
public class MyCustomerHealthIndicator implements HealthIndicator {


    @Autowired
    private MetricsEndpoint metricsEndpoint;

    @Override
    public Health health() {
         return Health.up().withDetail("Yashhhhhh","dshdd").build();
    }
}
