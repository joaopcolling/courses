package com.rockeseat.courses.modules.courses.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.rockeseat.courses.modules.courses.entities.CourseEntity;
import com.rockeseat.courses.modules.courses.repositories.CourseRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GetCourseStatusService {

    private final CourseRepository repository;

    public String execute(UUID id){

        CourseEntity entity = 
            repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Course not found."));

        return entity.getStatus() != null ? entity.getStatus().getStatus() : null;
    }
    
}
