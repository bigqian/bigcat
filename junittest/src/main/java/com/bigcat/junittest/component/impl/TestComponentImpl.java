package com.bigcat.junittest.component.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bigcat.junittest.component.TestComponent;
import com.bigcat.junittest.dao.TestJPADao;
import com.bigcat.junittest.po.TestDO;

@Component
public class TestComponentImpl implements TestComponent {

	@Autowired
	private TestJPADao testJPADao;

	@Override
	public TestDO insert(TestDO test) {
		return testJPADao.save(test);
	}

	@Override
	public void delete(TestDO test) {
		testJPADao.delete(test);
		return;
	}

	@Override
	public Optional<TestDO> findOne(long id) {
		return testJPADao.findById(id);
		
	}

}
