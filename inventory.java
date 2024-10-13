package morgcake;
import java.util.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
public class inventory {

		Statement stmt;
		 ResultSet rs;
		 Connection con;
		 String qry=null;
		 DBConn db=new DBConn();
		 int count=0;
		      Scanner sc=new Scanner(System.in);
		      List <details> list=new ArrayList <>();
		      main m;
		      public void addP(details s) {
		     boolean sts=false;
		     try {
		     con=(Connection) db.getDBConnection();
		     stmt=((Connection) con).createStatement();
		     count=stmt.executeUpdate("insert into name(ID,Name,cost,type,qty) values('"+s.getID()+"','"+s.getCakeName()+"','"+s.getCost()+"','"+s.getType()+"','"+s.getQuantity()+"')");
		     if(count==1)
		     sts=true;
		     else
		     throw new Exception();
		     }
		     catch(Exception ex) {
		     System.out.println(ex.getMessage());
		     }
		     //list.add(s);
		      }
		      public void update(details s) {
		     try {
		     con=db.getDBConnection();
		     stmt=con.createStatement();
		     count=stmt.executeUpdate("update name cost='"+s.getCost()+"' where quantity='"+s.getCakeName()+"'");
		     if(count==1) {
			} else
		     throw new Exception();
		     }catch(Exception ex) {
		     System.out.println(ex);
		     }
		     //System.out.println("Successfully updated");
		      }
		      public details search(String idu) {
		    for(int i=0;i<list.size();i++) {
		    if(list.get(i).getID().equals(idu))
		    return list.get(i);
		    }
		return null;
		      }
		      public boolean Remove(String idr) {
		     boolean sts=false;
		     try {
		     con=db.getDBConnection();
		     stmt=con.createStatement();
		     count=stmt.executeUpdate("delete from name where id='"+idr+"'");
		     if(count==1)
		     sts=true;
		     else
		    	 throw new Exception();
		     }catch(Exception ex) {
		     System.out.println(ex);
		     }
		     return sts;
		     /*for(int i=0;i<list.size();i++) {
		      if(list.get(i).getid().equals(idr))
		       list.remove(i);
		      }*/
		      }
		      public void show() {
		     try {
		     con = db.getDBConnection();
		     stmt=(Statement) con.createStatement();
		     rs=((java.sql.Statement) stmt).executeQuery("select * from name");
		     while(rs.next())
		     System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
		     }
		     catch(Exception ex) {
		     System.out.println(ex.getMessage());
		     }
		     //System.out.println(list);
		      }
		      public void logout() {
		    System.out.println("Logged out");
		    m.main(null);
		    for(details s:list) {
		    System.out.println(s);
		    }
		      }

}
