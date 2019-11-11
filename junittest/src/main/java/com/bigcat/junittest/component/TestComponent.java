package com.bigcat.junittest.component;

import java.util.Optional;

import com.bigcat.junittest.po.TestDO;

public interface TestComponent {

	public TestDO insert(TestDO test);

	public void delete(TestDO test);

	public Optional<TestDO> findOne(long id);
}
