package sjsu.cmpe.class273.gateway;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sjsu.cmpe.class273.gateway.repo.DeviceRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SmartGatewayApplication.class)
@WebAppConfiguration
public class SmartGatewayApplicationTests {

	@Autowired
	DeviceRepo deviceRepo;

	@Test
	public void contextLoads()
	{
		assertNotNull(deviceRepo.findOne("1"));
	}

}
