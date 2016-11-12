package com.teamtreehouse.courses.model;

import java.util.List;

/**
 * Created by kylederrick on 11/11/16.
 */
public interface CourseIdeaDAO {
    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();
}
