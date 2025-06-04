package com.rockeseat.courses.modules.courses.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveCourseDTO {
    private String name;

    private String category;

}
