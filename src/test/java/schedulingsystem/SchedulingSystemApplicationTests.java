package schedulingsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import schedulingsystem.config.SchedulingSystemApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SchedulingSystemApplication.class)
@WebAppConfiguration
public class SchedulingSystemApplicationTests {

	@Test
	public void contextLoads() {
	}

}
