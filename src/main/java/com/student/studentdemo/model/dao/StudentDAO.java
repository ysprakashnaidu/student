package com.student.studentdemo.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student")
public class StudentDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private int sid;
    @Column
    private String sname;
    @Column
    private String courseId;

}
