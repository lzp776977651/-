import com.qf.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by lzp on 2019/2/21 10:40
 */
public class TestUser {
    public static void main(String[] args) {
//        String resource = "mybatis-config.xml";
//        Reader reader = null;
//        try {
//            reader = Resources.getResourceAsReader(resource);
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//            SqlSession session = sqlSessionFactory.openSession();
////          List<User> users = session.selectOne("findAll");
//            List<User> list = session.selectList("findAll");
//            //3.处理结果
//            for (User user : list) {
//                System.out.println(user);
//            }
//            session.commit();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
