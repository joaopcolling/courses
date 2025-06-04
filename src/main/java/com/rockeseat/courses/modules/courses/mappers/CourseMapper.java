package com.rockeseat.courses.modules.courses.mappers;

import java.util.List;

import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;

import com.rockeseat.courses.modules.courses.dtos.CourseDTO;
import com.rockeseat.courses.modules.courses.dtos.SaveCourseDTO;
import com.rockeseat.courses.modules.courses.entities.CourseEntity;

@MapperConfig
public interface CourseMapper {

    CourseDTO mapEntityToCourseDTO(CourseEntity entity);

    List<CourseDTO> mapEntityListToCourseDTOList(List<CourseEntity> entityList); 

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "created_at", ignore = true)
    @Mapping(target = "update_at", ignore = true)
    CourseEntity mapSaveCourseDTOToEntity(SaveCourseDTO dto);
    
}
