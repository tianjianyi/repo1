package com.yifeng.manage.dao.impl;


import com.yifeng.manage.dao.UserDao;
import com.yifeng.manage.domain.Course;
import com.yifeng.manage.domain.Teacher;
import com.yifeng.manage.domain.User;
import com.yifeng.manage.util.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSouce());

    @Override
    public List<User> findAll() {
        String sql = "select * from user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public User findUserByUserIdAndPassword(String id, String password) {
        try{
            String sql = "select * from user where id = ? and password = ?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id, password);
            System.out.println(user);
            return user;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void addUser(User user) {
        String sql = "INSERT INTO USER VALUES(?, ?, '12345',?, ?);";
        template.update(sql, user.getId(), user.getUsername(), user.getMajor(), user.getCla());
    }
    @Override
    public void addTeacher(Teacher teacher) {
        String sql = "INSERT INTO teacher VALUES(?, ?, ?, ?);";
        template.update(sql, teacher.getWorkid(), teacher.getWorkname(), teacher.getAcollege(), teacher.getAsystem());
    }
    @Override
    public void addCourse(Course course) {
        String sql = "INSERT INTO course VALUES(?, ?, ?, ?);";
        template.update(sql, course.getClassid(), course.getClassname(), course.getGread(), course.getNum());
    }

    @Override
    public void deleteCourse(String id) {
        String sql = "delete from course where classid = ?";
        template.update(sql, id);
    }

    @Override
    public void delete(String id) {
        String sql = "delete from user where id = ?";
        template.update(sql, id);
    }
    public void deleteTeacher(String id) {
        String sql = "delete from teacher where workid = ?";
        template.update(sql, id);
    }

    @Override
    public List<Teacher> findAllTeacher() {
        String sql = "select * from teacher";
        List<Teacher> teachers = template.query(sql, new BeanPropertyRowMapper<Teacher>(Teacher.class));
        return teachers;
    }

    @Override
    public List<Course> findAllCourse() {
        String sql = "select * from course";
        List<Course> courses = template.query(sql, new BeanPropertyRowMapper<Course>(Course.class));
        return courses;
    }



    @Override
    public User findUserById(String id) {
        String sql = "select * from user where id = ?";

        return template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
    }

    @Override
    public void update(User user) {
        String sql = "update user set username = ?, major = ?, cla = ? where id = ?";
        template.update(sql, user.getUsername(), user.getMajor(), user.getCla(), user.getId());

    }

    @Override
    public int findTotalCount(Map<String, String[]> condition) {
        String sql = "select count(*) from user where 1 = 1 ";
        StringBuilder sb = new StringBuilder(sql);
        Set<String> keyset = condition.keySet();
        List<Object> params = new ArrayList<Object>();
        for (String key : keyset) {
            if("currentPage".equals(key) || "rows".equals(key)) continue;

            String values = condition.get(key)[0];
            if(values != null && !"".equals(values)){
                sb.append(" and "+key+" like ? ");
                params.add("%" + values + "%");
            }
        }
//        System.out.println(sb.toString());
//        System.out.println(params);
        return template.queryForObject(sb.toString(), Integer.class, params.toArray());
    }

    @Override
    public List<User> findUserByPage(int start, int rows, Map<String, String[]> condition) {
        String sql = "select * from user where 1 = 1 ";

        StringBuilder sb = new StringBuilder(sql);
        Set<String> keyset = condition.keySet();
        List<Object> params = new ArrayList<Object>();
        for (String key : keyset) {
            if("currentPage".equals(key) || "rows".equals(key)) continue;

            String values = condition.get(key)[0];
            if(values != null && !"".equals(values)){
                sb.append(" and "+key+" like ? ");
                params.add("%" + values + "%");
            }
        }
        sb.append(" limit ?,?");
        params.add(start);
        params.add(rows);
        return template.query(sb.toString(), new BeanPropertyRowMapper<User>(User.class), params.toArray());
    }

    @Override
    public List<Teacher> findTeacherByPage(int start, int rows, Map<String, String[]> condition) {
        String sql = "select * from teacher where 1 = 1 ";

        StringBuilder sb = new StringBuilder(sql);
        Set<String> keyset = condition.keySet();
        List<Object> params = new ArrayList<Object>();
        for (String key : keyset) {
            if("currentPage".equals(key) || "rows".equals(key)) continue;

            String values = condition.get(key)[0];
            if(values != null && !"".equals(values)){
                sb.append(" and "+key+" like ? ");
                params.add("%" + values + "%");
            }
        }
        sb.append(" limit ?,?");
        params.add(start);
        params.add(rows);
        return template.query(sb.toString(), new BeanPropertyRowMapper<Teacher>(Teacher.class), params.toArray());
    }
}
