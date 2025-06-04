package com.rockeseat.courses.modules.courses.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

public class CourseDTO {
    private UUID id;

    private String name;

    private String category;
    
    private String status;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;
    
}
