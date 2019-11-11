package com.bigcat.junittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bigcat.junittest.po.TestDO;
import com.bigcat.junittest.service.TestService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApp.class)
public class AppTest {

	@Autowired
	private TestService testService;

	private long id;

	@Before
	public void testBefore() throws Exception {
		TestDO vo = new TestDO();
		vo.setM("test" + System.currentTimeMillis());
		vo = testService.save(vo);
		id = vo.getId();
		System.out.println("begen end");
	}

	@After
	public void testAfter() throws Exception {
		TestDO vo = new TestDO();
		vo.setId(id);
		testService.delete(vo);
		System.out.println("after end");
	}

	@Test
	public void testApp() throws Exception {
		Optional<TestDO> optional = testService.findOne(id);
		assertTrue(!optional.isEmpty());
		TestDO vo = optional.get();
		String m = "test" + System.currentTimeMillis();
		vo.setM(m);
		testService.save(vo);
		optional = testService.findOne(id);
		assertTrue(!optional.isEmpty());
		assertEquals(m,vo.getM());
	}
}
