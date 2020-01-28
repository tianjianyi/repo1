package com.yifeng.manage.service.impl;


import com.yifeng.manage.dao.UserDao;
import com.yifeng.manage.dao.impl.UserDaoImpl;
import com.yifeng.manage.domain.Course;
import com.yifeng.manage.domain.PageBean;
import com.yifeng.manage.domain.Teacher;
import com.yifeng.manage.domain.User;
import com.yifeng.manage.service.UserService;

import java.util.List;
import java.util.Map;


public class UserServiceImpl implements UserService {

    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //调用dao
        return dao.findAll();
    }

    @Override
    public User login(User user) {
        return dao.findUserByUserIdAndPassword(user.getId(), user.getPassword());
    }

    @Override
    public void addUser(User user) {
        dao.addUser(user);
    }

    @Override
    public void deleteUser(String id) {
        dao.delete(id);
    }

    @Override
    public void deleteCourse(String id) {
        dao.deleteCourse(id);
    }
    @Override
    public User findUserById(String id) {
        return dao.findUserById(id);

    }

    @Override
    public void updateUser(User user) {
        dao.update(user);
    }

    @Override
    public void delSelectedUser(String[] ids) {
        for (String id : ids) {
            dao.delete(id);
        }
    }
    @Override
    public void delSelectedTeacher(String[] ids) {
        for (String id : ids) {
            dao.deleteTeacher(id);
        }
    }

    @Override
    public List<Teacher> findAllTeacher() {
        return dao.findAllTeacher();
    }

    @Override
    public List<Course> findAllCourse() {
        return dao.findAllCourse();
    }

    @Override
    public void addCourse(Course course) {
        dao.addCourse(course);
    }



    @Override
    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {
        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);

        if(currentPage <= 0) currentPage = 1;
        PageBean<User> pb = new PageBean<User>();

        pb.setRows(rows);

        int totalCount = dao.findTotalCount(condition);
        pb.setTotalCount(totalCount);
        int start = (currentPage - 1) * rows;
        //System.out.println(start);
        List<User> list = dao.findUserByPage(start, rows, condition);
        //System.out.println(list);
        pb.setList(list);
        int totalPage = totalCount % rows == 0 ? totalCount / rows : totalCount / rows + 1;
        if(currentPage > totalPage) currentPage = totalPage;
        pb.setCurrentPage(currentPage);
        pb.setTotalPage(totalPage);
       // System.out.println("122--"+pb);
        return pb;
    }

    @Override
    public PageBean<Teacher> findTeacherByPage(String _currentPage, String _rows, Map<String, String[]> condition) {
        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);

        if(currentPage <= 0) currentPage = 1;
        PageBean<Teacher> pb = new PageBean<Teacher>();

        pb.setRows(rows);

        int totalCount = dao.findTotalCount(condition);
        pb.setTotalCount(totalCount);
        int start = (currentPage - 1) * rows;
        System.out.println(start);
        List<Teacher> list = dao.findTeacherByPage(start, rows, condition);
        System.out.println(list);
        pb.setList(list);
        int totalPage = totalCount % rows == 0 ? totalCount / rows : totalCount / rows + 1;
        if(currentPage > totalPage) currentPage = totalPage;
        pb.setCurrentPage(currentPage);
        pb.setTotalPage(totalPage);
        // System.out.println("122--"+pb);
        return pb;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        dao.addTeacher(teacher);
    }

    @Override
    public void deleteTeacher(String id) {
        dao.deleteTeacher(id);
    }

}
