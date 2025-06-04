package com.rockeseat.courses.modules.courses.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveCourseDTO {
    @NotBlank(message = "Course name it's required")
    private String name;

    @NotBlank(message = "Course category it's required")
    private String category;

    @Pattern(regexp = "(?i)^(ACTIVE|INACTIVE)$", message = "Status must be either ACTIVE or INACTIVE")
    private String status;

}
