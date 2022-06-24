package com.example.maintenancemonitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorTest {

    @Test

    void UpdateTest (){
        Main k = new Main();
        double time = 1.0;
        String text = "test msg";

        k.updateStatus(time, text);

        assertEquals(k.currentMessage, text);
        assertEquals(k.currentUptime, time);


    }

}