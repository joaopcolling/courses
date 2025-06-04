package com.rockeseat.courses.modules.courses.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.rockeseat.courses.modules.courses.repositories.CourseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GetStatusService {

    private final CourseRepository repository;

    Boolean isActive(UUID id){
        return repository.findActiveById(id); 
    }
    
}
