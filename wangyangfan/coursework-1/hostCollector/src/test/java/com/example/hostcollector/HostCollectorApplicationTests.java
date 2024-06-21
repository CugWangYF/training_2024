package com.example.hostcollector;

import com.example.hostcollector.service.ScheduleService;
import com.example.hostcollector.utils.IOProcessUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.ResourceAccessException;

import java.io.IOException;
import java.net.InetAddress;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class HostCollectorApplicationTests {

    @Autowired
    private ScheduleService scheduleService;

    @Test
    void getMemUtilization_ShouldReturnDoubleValue() throws IOException {
        double memVal = IOProcessUtils.getMemUtilization();
    }

    @Test
    void getCPUUtilization_ShouldReturnDoubleValue() throws IOException {
        double cpuVal = IOProcessUtils.getCPUUtilization();
    }

    @Test()
    void timedCollection_WhenMonitorServiceIsClosed_ShouldThrowResourceAccessException() {
        assertThrows(ResourceAccessException.class, () -> {
            scheduleService.timedCollection();
        });
    }

}
