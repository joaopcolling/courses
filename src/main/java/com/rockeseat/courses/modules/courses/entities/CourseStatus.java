package com.rockeseat.courses.modules.courses.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CourseStatus {
    ACTIVE("Active"),
    INACTIVE("Inatctive");

    private String value;
    
}
