package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController("/api/uptime")

public class Main {

    String originalMessage = "No Errors Found.";
    String currentMessage = "No Errors Found.";
    Double currentUptime = 100.0;

    @RequestMapping("/updateStatus")
    @CrossOrigin()
    public String updateStatus(@RequestParam double uptime, String message) {
        currentUptime = uptime;
        currentMessage = message;
        return "OK";
    }

    @RequestMapping("/resetStatus")
    @CrossOrigin()
    public String resetStatus() {
        currentUptime = 100.0;
        currentMessage = originalMessage;
        return "OK";
    }



}
