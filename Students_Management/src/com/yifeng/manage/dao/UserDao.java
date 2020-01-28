package com.yifeng.manage.dao;



import com.yifeng.manage.domain.Course;
import com.yifeng.manage.domain.Teacher;
import com.yifeng.manage.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    public List<User> findAll();
    public User findUserByUserIdAndPassword(String id, String password);

    public void addUser(User user);

    void delete(String id);

    User findUserById(String id);

    void update(User user);

    int findTotalCount(Map<String, String[]> condition);

    List<User> findUserByPage(int start, int rows, Map<String, String[]> condition);

    List<Teacher> findTeacherByPage(int start, int rows, Map<String, String[]> condition);

    void addTeacher(Teacher teacher);

    void deleteTeacher(String id);

    List<Teacher> findAllTeacher();

    List<Course> findAllCourse();

    void addCourse(Course course);

    void deleteCourse(String id);
}
