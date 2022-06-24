package com.example.maintenancemonitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorTest {
    Main k = new Main();
    @Test

    void UpdateTest (){

        double time = 1.0;
        String text = "test msg";

        k.updateStatus(time, text);

        assertEquals(k.currentMessage, text);
        assertEquals(k.currentUptime, time);

    }

    @Test
    void ResetTest(){

        String text= "No Errors Found.";
        double time = 100.0;

        k.updateStatus(50.1, "test msg");
        k.resetStatus();

        assertEquals(k.currentMessage, text);
        assertEquals(k.currentUptime, time);
    }

}