package com.anytimedeveloper.simpleCURDapplication.converter;

import com.anytimedeveloper.simpleCURDapplication.StudentEntity;
import com.anytimedeveloper.simpleCURDapplication.dto.StudentEntryDto;
import com.anytimedeveloper.simpleCURDapplication.dto.StudentResponseDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class StudentConverter {
    public static StudentEntity dtoToEntity(StudentEntryDto studentEntryDto)
    {
        return StudentEntity.builder().age(studentEntryDto.getAge()).courseName(studentEntryDto.getCourseName())
                .name(studentEntryDto.getName()).rollNo(studentEntryDto.getRollNo()).build();
    }
    public static StudentResponseDto entityToDto(StudentEntity studentEntity)
    {
        return StudentResponseDto.builder().age(studentEntity.getAge()).courseName(studentEntity.getCourseName())
                .name(studentEntity.getName()).rollNo(studentEntity.getRollNo())
                .id(studentEntity.getStudentId()).build();
    }
}
