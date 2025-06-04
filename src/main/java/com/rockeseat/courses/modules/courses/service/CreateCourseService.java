package com.rockeseat.courses.modules.courses.service;

import org.springframework.stereotype.Service;

import com.rockeseat.courses.modules.courses.dtos.CourseDTO;
import com.rockeseat.courses.modules.courses.dtos.SaveCourseDTO;
import com.rockeseat.courses.modules.courses.entities.CourseEntity;
import com.rockeseat.courses.modules.courses.enums.CourseStatus;
import com.rockeseat.courses.modules.courses.mappers.CourseMapper;
import com.rockeseat.courses.modules.courses.repositories.CourseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateCourseService {

    private final CourseRepository repository;

    private final CourseMapper mapper;

    public CourseDTO execute(SaveCourseDTO dto){

        CourseEntity entity = CourseEntity
            .builder()
            .name(dto.getName())
            .category(dto.getCategory())
            .status(CourseStatus.fromString(dto.getStatus()))
            .build();

        repository.save(entity);
        
        return mapper.mapEntityToCourseDTO(entity);
    }
    
}
