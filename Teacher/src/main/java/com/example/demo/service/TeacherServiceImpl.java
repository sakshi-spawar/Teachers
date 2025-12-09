package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
private TeacherRepository tr;

	@Override
	public void add(Teacher teach) {
		// TODO Auto-generated method stub
		tr.save(teach);
	}

	@Override
	public List<Teacher> display() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}
	
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		tr.deleteById(id);
			}
	public void update(Integer id,Teacher teach) {
		teach.setId(id);
		tr.save(teach);
		}
	}