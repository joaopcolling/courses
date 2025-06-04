package com.rockeseat.courses.modules.courses.enums;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CourseStatus {
    ACTIVE("Active"),
    INACTIVE("Inactive");

    private String status;

    public static CourseStatus fromString(String status) {
        
        return Arrays.stream(CourseStatus.values())
            .filter(cs -> cs.getStatus().equalsIgnoreCase(status))
            .findFirst()
            .orElseThrow(() ->
                    new IllegalArgumentException("Invalid CourseStatus: " + status));
    }
}
