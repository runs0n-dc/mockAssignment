package com.anytimedeveloper.simpleCURDapplication;

import com.anytimedeveloper.simpleCURDapplication.converter.StudentConverter;
import com.anytimedeveloper.simpleCURDapplication.dto.StudentEntryDto;
import com.anytimedeveloper.simpleCURDapplication.dto.StudentResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addStudent(StudentEntryDto studentEntryDto)
    {
        StudentEntity studentEntity = StudentConverter.dtoToEntity(studentEntryDto);
        studentRepository.save(studentEntity);
    }
    public StudentResponseDto getStudent(int id)
    {
        StudentEntity studentEntity = studentRepository.findById(id).get();
        StudentResponseDto studentResponseDto = StudentConverter.entityToDto(studentEntity);
        return studentResponseDto;
    }
    public void updateStudent(StudentEntryDto studentEntryDto, int id)
    {
        StudentEntity studentEntity1 = StudentConverter.dtoToEntity(studentEntryDto);
        studentEntity1.setStudentId(id);
        studentRepository.save(studentEntity1);
    }
    public void deleteStudent(int id)
    {
        studentRepository.deleteById(id);
    }
}
