package com.anytimedeveloper.simpleCURDapplication;

import com.anytimedeveloper.simpleCURDapplication.dto.StudentEntryDto;
import com.anytimedeveloper.simpleCURDapplication.dto.StudentResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public ResponseEntity<String> addStudent(@RequestBody(required = true)StudentEntryDto studentEntryDto)
    {
        studentService.addStudent(studentEntryDto);
        return new ResponseEntity<>("Student added successfully", HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<String> updateStudent(@RequestBody(required = true) StudentEntryDto studentEntryDto,
                                                @RequestParam("id") int id)
    {
        studentService.updateStudent(studentEntryDto, id);
        return new ResponseEntity<>("student updated successfully",HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<StudentResponseDto> getStudent(@PathVariable("id") int id)
    {
        return new ResponseEntity<>(studentService.getStudent(id),HttpStatus.FOUND);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int id)
    {
        studentService.deleteStudent(id);
        return new ResponseEntity<>("student deleted successfully",HttpStatus.OK);
    }

}
