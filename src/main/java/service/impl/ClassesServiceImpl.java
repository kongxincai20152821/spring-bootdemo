package service.impl;

import org.springframework.stereotype.Service;

import entity.Classes;
import service1.ClassesService;
@Service("classesService")
public class ClassesServiceImpl extends BaseServiceImpl<Classes> implements ClassesService{
}
