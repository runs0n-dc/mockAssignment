package com.anytimedeveloper.simpleCURDapplication;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @Column(name = "roll_number", nullable = false)
    private String rollNo;

    @Column(name = "student_name", nullable = false)
    private String name;

    @Column(name = "student_age", nullable = false)
    private int age;

    @Column(name = "course_name", nullable = false)
    private String courseName;
}
