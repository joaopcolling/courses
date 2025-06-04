package com.rockeseat.courses.modules.courses.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.rockeseat.courses.modules.courses.dtos.CourseDTO;
import com.rockeseat.courses.modules.courses.entities.CourseEntity;
import com.rockeseat.courses.modules.courses.mappers.CourseMapper;
import com.rockeseat.courses.modules.courses.repositories.CourseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GetCourseService {
    
    private final CourseRepository repository;

    private final CourseMapper mapper;

    public CourseDTO execute(UUID id){

        Optional<CourseEntity> entity = repository.findById(id);

        return mapper.mapEntityToCourseDTO(entity.get());
    }
}
