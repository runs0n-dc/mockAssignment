package com.anytimedeveloper.simpleCURDapplication.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentEntryDto {
    private String rollNo;
    private String name;
    private int age;
    private String courseName;
}
