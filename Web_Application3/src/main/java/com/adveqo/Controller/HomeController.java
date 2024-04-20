package com.adveqo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.adveqo.Entity.Lesson;
import com.adveqo.service.LessonService;


@RestController
public class HomeController {
	
//Testing purpose
@GetMapping("/")
public String Home() {
return "Welcome to Springboot Web Application";
}
@Autowired
private  LessonService lessonService;
@PostMapping("/Lesson")
public Lesson saveLesson(@RequestBody Lesson lesson){
lessonService.saveLesson(lesson);
return lesson;
	
}
	
}  