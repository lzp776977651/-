package com.qf.dao;

import com.qf.pojo.User;
import com.qf.pojo.UserInfo;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

/**
 * Created by lzp on 2019/2/21 10:16
 */
public class UserInfoDao extends  BaseDao{


    public UserInfo findAllById(int id) throws IOException {
        SqlSession sqlSession=this.getSession();
        UserInfo userInfo=sqlSession.selectOne("findAllById",2);

        return userInfo;
    }
    public void addUserInfo(UserInfo userInfo) throws IOException {
        SqlSession sqlSession=this.getSession();
        sqlSession.insert("addUserInfo");


    }
}
