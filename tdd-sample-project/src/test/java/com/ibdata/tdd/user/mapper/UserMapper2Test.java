package com.ibdata.tdd.user.mapper;

import java.io.File;

import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;
import org.junit.Test;

public class UserMapper2Test {
    private final String driver = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://127.0.0.1:3306/mysql2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final String username = "buzzy";
    private final String password = "2486";
    private final String schema = "mysql2";

   
    private IDatabaseTester databaseTester;
    
    @Before
    public void before() throws Exception {      
        databaseTester = new JdbcDatabaseTester(driver, url, username, password, schema);
        
        IDataSet dataSet = new FlatXmlDataSetBuilder().build(new File("C:/dev/sts-workspace/tdd-sample-project/src/test/java/com/ibdata/tdd/user/mapper/User.xml"));
        DatabaseOperation.CLEAN_INSERT.execute(databaseTester.getConnection(), dataSet);
    }
    
    @Test
    public void test() {
    	
    }


}
