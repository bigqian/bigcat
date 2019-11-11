package com.bigcat.junittest.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcat.junittest.component.TestComponent;
import com.bigcat.junittest.po.TestDO;
import com.bigcat.junittest.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestComponent testComponent;

	@Override
	@Transactional
	public TestDO save(TestDO test) throws Exception {
//		testComponent.insert(test);
//		throw new RuntimeException();
		return testComponent.insert(test);
	}

	@Override
	@Transactional
	public void delete(TestDO test) {
		testComponent.delete(test);
		return;
	}

	@Override
	public Optional<TestDO> findOne(long id) {
		return testComponent.findOne(id);
	}

}
