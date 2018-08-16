
package com.mycompany.mavenproject10;

import java.util.List;

public class SpringjdbcTemplateEx {
    
    public static void main(String[] args){
        
        Appicationcontext ctx=new ClasspathXmlApplicationContext("my-beans.xml");
        
        JdbcTemplate jdbcTemplate =(JdbcTemplate)ctx.getbean("jdbcTemplate");
        
        jdbcTemplate.execute("DROP TABLE IF EXISTS Friends");
        jdbcTemplate.execute("CREATE TABLE Friends(Id INT, Name VARCHAR(30), "
                + "Age INT)");
         jdbcTemplate.update("INSERT INTO Friends VALUES(1, 'Paul', 27)");
        jdbcTemplate.update("INSERT INTO Friends VALUES(2, 'Monika', 34)");
        jdbcTemplate.update("INSERT INTO Friends VALUES(3, 'Peter', 20)");
        jdbcTemplate.update("INSERT INTO Friends VALUES(4, 'Lucy', 45)");
        jdbcTemplate.update("INSERT INTO Friends VALUES(5, 'Roman', 57)");
        
        int id = 1;
        String sql = "SELECT * FROM Friends WHERE Id=?";
         Friend f = (Friend) jdbcTemplate.queryForObject(sql, new Object[]{id},
                new BeanPropertyRowMapper(Friend.class));
          System.out.println(f);
            List<Friend> allFriends = jdbcTemplate.query("SELECT * FROM Friends",
                new BeanPropertyRowMapper(Friend.class));
        
        allFriends.stream().forEach(System.out::println);
    }
        
    }
    
    
    
}
