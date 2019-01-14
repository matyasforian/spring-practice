package com.codecool.springpractice;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringpracticeApplicationTests {

	@Test
	public void contextLoads() {
		Assert.assertEquals(3, 3);
	}

    @Test
    public void someOtherTest() {
        Assert.assertEquals(4, 4);
    }

}
