package com.bigcat.junittest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bigcat.junittest.po.TestDO;

@Repository
public interface TestJPADao extends JpaRepository<TestDO, Long> {

}
