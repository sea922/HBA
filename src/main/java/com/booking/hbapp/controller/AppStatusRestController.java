package com.booking.hbapp.controller;


import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppStatusRestController {
    private final List<HealthIndicator> healthIndicators;

    public AppStatusRestController(List<HealthIndicator> healthIndicators) {
        this.healthIndicators = healthIndicators;
    }

    @GetMapping("/status")
    public String status() {
        return "status: " + getStatus();
    }
    private String getStatus() {
        return isUp() ? Status.UP.getCode() : Status.DOWN.getCode();

    }

    private boolean isUp() {
        return this.healthIndicators.stream().allMatch(healthIndicator -> healthIndicator.getHealth(false).getStatus() == Status.UP);
    }

}
