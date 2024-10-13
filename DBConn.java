package morgcake;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConn
{
public Connection getDBConnection()
{
Connection con=null;
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cake","root","");
}
catch(Exception e)
{
System.out.println(e);
}
return con;
}
}