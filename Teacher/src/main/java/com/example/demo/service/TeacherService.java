package com.example.demo.service;


import java.util.List;

import com.example.demo.model.Teacher;

public interface TeacherService {
 void add(Teacher teach);
 List<Teacher>display();
 void delete(Integer id);
 void update(Integer id,Teacher teach);

}