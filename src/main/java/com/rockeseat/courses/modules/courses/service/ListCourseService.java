package com.rockeseat.courses.modules.courses.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rockeseat.courses.modules.courses.dtos.CourseDTO;
import com.rockeseat.courses.modules.courses.entities.CourseEntity;
import com.rockeseat.courses.modules.courses.mappers.CourseMapper;
import com.rockeseat.courses.modules.courses.repositories.CourseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ListCourseService {
    private final CourseRepository repository;

    private final CourseMapper mapper;

    public List<CourseDTO> execute(){

        List<CourseEntity> entityList = repository.findAll();
        
        return mapper.mapEntityListToCourseDTOList(entityList);
    }
}
