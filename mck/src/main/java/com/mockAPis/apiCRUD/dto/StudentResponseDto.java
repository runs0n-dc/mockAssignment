package com.anytimedeveloper.simpleCURDapplication.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentResponseDto {
    private int id;
    private String rollNo;
    private String name;
    private int age;
    private String courseName;
}
