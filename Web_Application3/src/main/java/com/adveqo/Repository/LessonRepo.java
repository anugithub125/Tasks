package com.adveqo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adveqo.Entity.Lesson;
@Repository
public interface LessonRepo extends JpaRepository<Lesson, Integer>{

}
