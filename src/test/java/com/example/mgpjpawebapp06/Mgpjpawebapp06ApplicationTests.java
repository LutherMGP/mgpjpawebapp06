package com.example.mgpjpawebapp06;

import com.example.mgpjpawebapp06.model.Student;
import com.example.mgpjpawebapp06.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class Mgpjpawebapp06ApplicationTests {

    @Autowired
    StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        Student std = new Student();
        std.setName("test");
        studentRepository.save(std);
    }

    @Test
    void contextLoads() {
        List<Student> lst = studentRepository.findAll();
        assertEquals(1,lst.size());
    }
}
