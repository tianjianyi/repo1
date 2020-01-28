package com.yifeng.manage.service;



import com.yifeng.manage.domain.Course;
import com.yifeng.manage.domain.PageBean;
import com.yifeng.manage.domain.Teacher;
import com.yifeng.manage.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();
    public User login(User user);

    public void addUser(User user);

    void deleteUser(String id);

    User findUserById(String id);

    void updateUser(User user);

    void delSelectedUser(String[] ids);

    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);

    PageBean<Teacher> findTeacherByPage(String currentPage, String rows, Map<String, String[]> condition);

    void addTeacher(Teacher teacher);

    void deleteTeacher(String id);

    void delSelectedTeacher(String[] ids);

    List<Teacher> findAllTeacher();

    List<Course> findAllCourse();

    void addCourse(Course course);

    void deleteCourse(String id);
}
