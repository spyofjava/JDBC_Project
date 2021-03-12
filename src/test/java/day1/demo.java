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

/*
        String url = "jdbc:oracle:thin:@54.211.129.23:1521:XE" ;
        String username = "hr" ;
        String password = "hr" ;

        Connection con = DriverManager.getConnection(url,username,password);

        Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = stm.executeQuery("SELECT * FROM JOBS") ;

        while (rs.next()){

            System.out.print(rs.getString(1));
            System.out.print("\t\t"+rs.getString(2));
            System.out.println("\t\t\t"+rs.getString(3));
           // System.out.println(rs.getString("JOB_TITLE")+" "+rs.getString("MIN_SALARY") +" "+rs.getString("MAX_SALARY") );


        }



 */


        String url = "jdbc:oracle:thin:@54.211.129.23:1521:XE" ;
        String username = "hr" ;
        String password = "hr" ;

        Connection con = DriverManager.getConnection(url,username,password);

        Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = stm.executeQuery("SELECT * FROM REGIONS") ;

        /*
        rs.next();
        rs.previous();
        rs.first();
        rs.last();
        rs.beforeFirst();
        rs.afterLast();
        rs.absolute();
         */


        /*
        rs.next();
        System.out.println("FIRST ROW "+rs.getString(2));
        rs.last();
        System.out.println("LAST ROW "+rs.getString(2));
        rs.previous();
        System.out.println("PREVIOUS ROW "+rs.getString(2));

        rs.beforeFirst();
        //rs.first(); //pay attention here
        while (rs.next()){
            System.out.println("2nd ROW REGION_NAME IS "+rs.getString(2));
        }

        rs.absolute(2);
        System.out.println("2nd ROW REGION_NAME IS "+rs.getString(2));


 */


        /*
        rs.beforeFirst();
        //rs.first(); //pay attention here
        while (rs.next()){
            //System.out.println(rs.next());
            System.out.println("rs.getString(1) = "+rs.getString(1));
        }


        rs.afterLast();
        while (rs.previous()){
            //System.out.println(rs.next());
            System.out.println("rs.getString(1) = "+rs.getString(1));
        }

 */


        ResultSetMetaData rsmd = rs.getMetaData();


        System.out.println(rsmd.getColumnCount());
        System.out.println("rsmd.getColumnName(1) = " + rsmd.getColumnName(1));
        System.out.println("rsmd.getColumnName(2) = " + rsmd.getColumnName(2));


    }
}
