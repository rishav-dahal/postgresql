package Day1;

import java.sql.*;

public class Getdata {
    public static void main (String[]args){
        final String url="jdbc:postgresql://localhost:5432";
        final String dbname="Rishav";
        final String uname="postgres";
        final String pass="";
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url+"/" + dbname, uname,pass);
            Statement st= conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM student");
            while (rs.next()){
                System.out.println("Roll="+rs.getInt(1)+"Name"+rs.getString(2)+"Faculty"+rs.getString(3));
            }

        }catch(Exception e){
            e.getMessage();
        }

    }
}
