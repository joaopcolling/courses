package com.rockeseat.courses.modules.courses.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rockeseat.courses.modules.courses.dtos.CourseDTO;
import com.rockeseat.courses.modules.courses.dtos.SaveCourseDTO;
import com.rockeseat.courses.modules.courses.service.CreateCourseService;
import com.rockeseat.courses.modules.courses.service.DeleteCourseService;
import com.rockeseat.courses.modules.courses.service.GetCourseService;
import com.rockeseat.courses.modules.courses.service.GetCourseStatusService;
import com.rockeseat.courses.modules.courses.service.ListCourseService;
import com.rockeseat.courses.modules.courses.service.UpdateCourseService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("curso")
@RequiredArgsConstructor
public class CourseController {

    private final CreateCourseService createCourseService;

    private final UpdateCourseService updateCourseService;

    private final GetCourseService getCourseService;

    private final GetCourseStatusService getCourseStatusService;

    private final ListCourseService listCourseService;

    private final DeleteCourseService deleteCourseService;

    @GetMapping("/{id}")
    public ResponseEntity<CourseDTO> get(@PathVariable UUID id) {
        CourseDTO dto = getCourseService.execute(id);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    @GetMapping
    public ResponseEntity<List<CourseDTO>> list() {
        List<CourseDTO> dto = listCourseService.execute();
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }
    
    
    @PostMapping
    public ResponseEntity<CourseDTO> create(@Valid @RequestBody SaveCourseDTO saveDto) {
        CourseDTO dto = createCourseService.execute(saveDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CourseDTO> update(@PathVariable UUID id, @Valid @RequestBody SaveCourseDTO saveDto) {
        CourseDTO dto = updateCourseService.execute(id, saveDto);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id){
        deleteCourseService.execute(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<String> getStatusById(@PathVariable UUID id) {
        String status = getCourseStatusService.execute(id);
        return ResponseEntity.ok(status);
    }
    
}
