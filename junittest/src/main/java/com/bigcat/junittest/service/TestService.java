package com.bigcat.junittest.service;

import java.util.Optional;

import com.bigcat.junittest.po.TestDO;

public interface TestService {

	public TestDO save(TestDO test) throws Exception;

	public void delete(TestDO test);

	public Optional<TestDO> findOne(long id);
}
