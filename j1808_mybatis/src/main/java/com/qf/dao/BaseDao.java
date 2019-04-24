package com.qf.dao;

import com.qf.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by lzp on 2019/2/21 10:16
 */
public class BaseDao {
    public SqlSession getSession() throws IOException {
        String aaa="mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(aaa);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sqlSessionFactory.openSession();

        return session;
    }
}
