package morgcake;
import java.util.*;
public class main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    inventory in=new inventory();
	    System.out.println("Welcome to cake orders");
	    details s=new details(null, null, 0, null, 0);
	    System.out.println("username:");
	    String lname=sc.next()+sc.nextLine();
	    System.out.println("Password:");
	    String password=sc.next()+sc.nextLine();
	    login l=new login();
	    user u=new user(lname,password);
	    String choice;
	    try {
	         if(l.admin(u)) {
	    do {
	    System.out.println("1.Add 2.Update 3.search 4.remove 5.show 6.Logout");
	    System.out.println("Enter option:");
	    int op=sc.nextInt();
	    switch(op) {
	    case 1:
	    //s=new shoeshop();
	    	System.out.println("Enetr the id:");
	    	 s.setID(sc.next()+sc.nextLine());
	    	 System.out.println("Enetr the name:");
	        s.setCakeName(sc.next()+sc.nextLine());
	        System.out.println("Enter the cost:");
	        s.setCost(sc.nextInt());
	        System.out.println("Enter the type:");
	        s.setType(sc.next());
	        System.out.println("Enter the Quantity:");
	        s.setQuantity(sc.nextInt());
	        //s.setid(sc.next()+sc.nextLine());
	        in.addP(s);
	        break;
	    case 2:
	    System.out.println("Enter the name to be upadated:");
	        String name=sc.next()+sc.nextLine();
	        System.out.println("Enter the cost to be updated:");
	        int cost=sc.nextInt();
	        s.setCakeName(name);
	        s.setCost(cost);
	        in.update(s);
	        //s=in.search(idu);
	        //s.setname(sc.next()+sc.nextLine());
	        //in.update();
	        break;
	    case 3:
	    String ids=sc.next()+sc.nextLine();
	    s=in.search(ids);
	    System.out.println(s);
	    break;
	    case 4:
	    System.out.println("Enter the id to be deleted:");
	    String idr=sc.next()+sc.nextLine();
	    s.setID(idr);
	    boolean d=in.Remove(idr);
	    if(d)
	    	System.out.println("Deleted Successfully");
	    else
	    	System.out.println("Could not delete");
	    break;
	    case 5:
	    in.show();
	    break;
	    case 6:
	    in.logout();
	    }
	    System.out.println("Enter yes to continue");
	    choice=sc.next()+sc.nextLine();
	    }while(choice!="No");
	    }
	         else {
	        throw new InvalidPassword();
	        }
	        }
	        catch(InvalidPassword e) {
	        System.out.println("Invalid password");
	        }
	     }


	}

