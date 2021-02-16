package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    //打印全部
    @Test
    public void test(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //最建议使用的方式
            //方式一 ：getMapper
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            List<User> userList = userDao.getUserList();
            //方法二： 不推荐使用
//        List<User> userList = sqlSession.selectList("com.kuang.dao.UserDao.getUserList");
            for (User user : userList){
                System.out.println(user);
            }

            //关闭SqlSession
            sqlSession.close();

    }
//    //打印id
//    @Test
//    public void getUserById(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserDao mapper= sqlSession.getMapper(UserDao.class);
//        User user = mapper.getUserById(1);
//        System.out.println(user);
//        sqlSession.close();
//    }
//    //增删改查需要提交事务 增加
//    @Test
//    public void addUser(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserDao mapper= sqlSession.getMapper(UserDao.class);
//        int haha = mapper.addUser(new User(4,"哈哈","123333"));
//        if(haha>0){
//            System.out.println("插入成功！");
//        }
//        //提交事务
//        sqlSession.commit();
//        sqlSession.close();
//    }
//    //改 update
//    @Test
//    public void updateUser(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserDao userdao = sqlSession.getMapper(UserDao.class);
//        userdao.updateUser(new User(4,"呵呵","123123"));
//        sqlSession.commit();
//        sqlSession.close();
//    }

}
