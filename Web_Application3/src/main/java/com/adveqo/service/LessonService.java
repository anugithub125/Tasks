package com.adveqo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.adveqo.Entity.Lesson;
import com.adveqo.Repository.LessonRepo;

@Service
public class LessonService {

@Autowired

private LessonRepo lessonRepo;

public Lesson saveLesson (Lesson lesson) {

Lesson lesson1=lessonRepo.save(lesson);
		
return lesson1 ;


}
}
