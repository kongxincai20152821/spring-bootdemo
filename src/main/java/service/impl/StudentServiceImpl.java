package service.impl;

import org.springframework.stereotype.Service;

import entity.Student;
import service1.StudentService;
@Service("studentService")
public class StudentServiceImpl extends BaseServiceImpl<Student> implements StudentService{
}
