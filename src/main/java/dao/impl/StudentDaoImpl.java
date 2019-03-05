package dao.impl;

import org.springframework.stereotype.Repository;

import dao1.StudentDao;
import entity.Student;
@Repository("studentDao")
public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao{
}
