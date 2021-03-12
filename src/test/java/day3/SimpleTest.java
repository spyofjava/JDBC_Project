package day3;

import org.junit.Assert;
import org.junit.Test;
import utility.ConfigurationReader;
import utility.DB_Utility;

public class SimpleTest {

    @Test
    public void testDashboardNumbers(){
        int userCountUI = 8553 ;
        int bookCountUI = 1992 ;
        int borrowedBookCountUI = 800 ;

        String url = ConfigurationReader.getProperty("library1.database.url");
        String username = ConfigurationReader.getProperty("library1.database.username");
        String password = ConfigurationReader.getProperty("library1.database.password");


        DB_Utility.createConnection(url,username, password);
        DB_Utility.runQuery("SELECT count(*) FROM books");

        String bookCountDB_Str = DB_Utility.getFirstRowFirstColumn();
        int  bookCountDB = Integer.parseInt(bookCountDB_Str);


        Assert.assertEquals(bookCountDB,bookCountUI);


        DB_Utility.destroy();
    }


}
