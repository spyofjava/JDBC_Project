package day1;

import java.sql.*;

public class demo {
    public static void main(String[] args) throws SQLException {

/*
        String url = "jdbc:oracle:thin:@54.211.129.23:1521:XE" ;
        try {
            Connection con = DriverManager.getConnection(url,"hr","hr");

//            System.out.println("CONNECTION SUCCESSFUL");


            Statement stmnt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = stmnt.executeQuery("SELECT *FROM REGIONS");

            rs.next(); //we are at first row now

            System.out.println("FIRST ROW REGION_NAME IS "+rs.getString("REGION_Name"));


            rs.next(); //we are at first row now

            System.out.println("SECOND ROW REGION_NAME IS "+rs.getString("REGION_Name"));


            rs.next(); //we are at first row now

            System.out.println("THIRD ROW REGION_NAME IS "+rs.getString("REGION_Name"));


            rs.next(); //we are at first row now

            System.out.println("FOURTH ROW REGION_NAME IS "+rs.getString("REGION_Name"));




            System.out.println("CONNECTION SUCCESSFUL");


        }catch (SQLException e){
            System.out.println("CONNECTION HAS FAILED "+e.getMessage());
        }


 */

/*
        String url = "jdbc:oracle:thin:@54.211.129.23:1521:XE" ;
        String username = "hr" ;
        String password = "hr" ;


        Connection con =DriverManager.getConnection(url,username,password);

        Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet rs =stm.executeQuery("SELECT*FROM REGIONS") ;


       // rs.next(); //return type boolean true / false
        //System.out.println("Region value at this row is "+rs.getString("REGION_NAME") );

        while (rs.next()){
            System.out.println(" REGION ID at this row is "+rs.getString("REGION_ID"));
            System.out.println("Region value at this row is "+rs.getString("REGION_NAME") );


        }


 */


        String url = "jdbc:oracle:thin:@54.211.129.23:1521:XE" ;
        String username = "hr" ;
        String password = "hr" ;

        Connection con = DriverManager.getConnection(url,username,password);

        Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = stm.executeQuery("SELECT * FROM JOBS") ;










    }
}
