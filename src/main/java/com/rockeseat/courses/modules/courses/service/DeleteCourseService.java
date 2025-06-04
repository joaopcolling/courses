package com.rockeseat.courses.modules.courses.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.rockeseat.courses.modules.courses.repositories.CourseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DeleteCourseService {
    
    private final CourseRepository repository;

    public void execute(UUID id){

        repository.deleteById(id);
    }
}
