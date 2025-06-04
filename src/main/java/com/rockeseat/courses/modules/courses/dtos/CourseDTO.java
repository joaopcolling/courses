package com.rockeseat.courses.modules.courses.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {
    private UUID id;

    private String name;

    private String category;
    
    private String status;

    private LocalDateTime created_at;

    private LocalDateTime updated_at;
    
}
