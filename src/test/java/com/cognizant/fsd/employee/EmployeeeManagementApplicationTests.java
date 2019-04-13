package com.cognizant.fsd.employee;

import static org.junit.Assert.assertEquals;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(
	    properties = "spring.datasource.type=com.zaxxer.hikari.HikariDataSource"
		)
public class EmployeeeManagementApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Autowired
    private DataSource dataSource;
 
    @Test
    public void hikariConnectionPoolIsConfigured() {
        assertEquals("com.zaxxer.hikari.HikariDataSource", dataSource.getClass().getName());
    }

}
