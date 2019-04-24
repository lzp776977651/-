import com.qf.dao.UserInfoDao;
import com.qf.pojo.UserInfo;

import java.io.IOException;

/**
 * Created by lzp on 2019/2/21 15:38
 */
public class TestUserInfo {
    public static void main(String []args) throws IOException {
        UserInfoDao userInfoDao=new UserInfoDao();
//       UserInfo userInfo=userDao.findAllById(2);
//        System.out.println(userInfo);
        UserInfo userInfo =new UserInfo();
        userInfo.setPassword("9999");
        userInfo.setUserName("笑笑");
        userInfoDao.addUserInfo(userInfo);
    }

}
