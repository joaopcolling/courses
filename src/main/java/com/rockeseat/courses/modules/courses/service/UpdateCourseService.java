package com.rockeseat.courses.modules.courses.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.rockeseat.courses.modules.courses.dtos.CourseDTO;
import com.rockeseat.courses.modules.courses.dtos.SaveCourseDTO;
import com.rockeseat.courses.modules.courses.entities.CourseEntity;
import com.rockeseat.courses.modules.courses.enums.CourseStatus;
import com.rockeseat.courses.modules.courses.mappers.CourseMapper;
import com.rockeseat.courses.modules.courses.repositories.CourseRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UpdateCourseService {

    private final CourseRepository repository;

    private final CourseMapper mapper;

    public CourseDTO execute(UUID id, SaveCourseDTO dto){

        CourseEntity entity = 
            repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Course not found."));

        entity.setName(dto.getName());
        entity.setCategory(dto.getCategory());
        entity.setStatus(CourseStatus.fromString(dto.getStatus()));

        repository.save(entity);
        
        return mapper.mapEntityToCourseDTO(entity);
    }
    
}
