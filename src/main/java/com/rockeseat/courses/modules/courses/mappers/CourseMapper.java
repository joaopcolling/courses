package com.rockeseat.courses.modules.courses.mappers;

import java.util.List;
import java.util.Objects;

import org.mapstruct.Mapper;

import com.rockeseat.courses.modules.courses.dtos.CourseDTO;
import com.rockeseat.courses.modules.courses.entities.CourseEntity;
import com.rockeseat.courses.modules.courses.enums.CourseStatus;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    CourseDTO mapEntityToCourseDTO(CourseEntity entity);

    List<CourseDTO> mapEntityListToCourseDTOList(List<CourseEntity> entityList); 

    default String map(CourseStatus status) {
        return Objects.nonNull(status) ? status.getStatus() : null;
    }

}
