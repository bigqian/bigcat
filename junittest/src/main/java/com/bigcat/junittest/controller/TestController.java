package com.bigcat.junittest.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bigcat.junittest.po.TestDO;
import com.bigcat.junittest.service.TestService;

@RestController
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	String home(@PathVariable(value = "name") String name) throws SQLException {
		return name;
	}

	@RequestMapping(value = "/insert/{name}", method = RequestMethod.GET)
	String insert(@PathVariable(value = "name") String name) throws Exception {
		TestDO test = new TestDO();
		test.setM(name);
		testService.save(test);
		return name;
	}

	@RequestMapping(value = "/delete/{name}", method = RequestMethod.GET)
	String delete(@PathVariable(value = "name") String name) throws SQLException {
		TestDO test = new TestDO();
		test.setM(name);
		testService.delete(test);
		return name;
	}

	@RequestMapping(value = "/update/{name}", method = RequestMethod.GET)
	String update(@PathVariable(value = "name") String name) throws Exception {
		TestDO test = new TestDO();
		test.setM(name + name);
		testService.save(test);
		return name;
	}
}
