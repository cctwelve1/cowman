import com.practice.cowman.CowmanApp;
import com.practice.cowman.dao.DiscussPostMapper;
import com.practice.cowman.entity.DiscussPost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CowmanApp.class)
public class MapperTest {

    @Resource
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectPosts() {
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for (DiscussPost post : discussPosts) {
            System.out.println(post);

            int i = discussPostMapper.selectDiscussPostRows(0);
            System.out.println(i);

        }
    }

}
