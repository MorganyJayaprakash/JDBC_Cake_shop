package morgcake;

public class login {
	public String aname="morg";
    public String apwd="2004";
   public boolean admin(user u) {
if(u.getLname().equals(aname) && u.getPassword().equals(apwd)) {
  return true;
}
else {
return false;  
}
   }
}

