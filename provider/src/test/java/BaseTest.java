import com.acmday.dubbo.demo.provider.ApplicationLoader;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author acmday
 * @date 2022/9/11 下午11:43
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ApplicationLoader.class})
public class BaseTest {
}
