package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello Started......" );
        //spring jdbc -> JDBCTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        
        
        //insert query
        String query = "insert into student(id, name, city) values(?,?,?)";
        
        //fire query
        template.update(query, 456,"Muskan Jain", "")
    }
}
