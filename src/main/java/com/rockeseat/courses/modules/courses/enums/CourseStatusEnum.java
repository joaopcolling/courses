package com.rockeseat.courses.modules.courses.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CourseStatusEnum {
    ACTIVE("Active"),
    INACTIVE("Inatctive");

    private String value;
    
}
