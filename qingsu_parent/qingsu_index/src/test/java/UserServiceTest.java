import com.qs.QsMain8200;
import com.qs.controller.LoginController;
import com.qs.service.UserService;
import com.qs.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@ActiveProfiles("dev")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = QsMain8200.class)
public class UserServiceTest {
    @Resource
    private LoginController loginController;

    @Test
    public void testHttp(){
        loginController.wechatLogin("061l6A000lzmyK1eZp300JEmRC3l6A0e");
    }
}
