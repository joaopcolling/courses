package com.rockeseat.courses.modules.courses.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.rockeseat.courses.modules.courses.entities.CourseEntity;

public interface CourseRepository extends CrudRepository<CourseEntity, UUID> {
    
}
