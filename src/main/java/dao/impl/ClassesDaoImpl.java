package dao.impl;

import org.springframework.stereotype.Repository;

import dao1.ClassesDao;
import entity.Classes;
@Repository("classesDao")
public class ClassesDaoImpl extends BaseDaoImpl<Classes> implements ClassesDao{

}
