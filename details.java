package morgcake;

public class details{
	public details(String iD, String cakeName, int cost, String type, int quantity) {
		super();
		ID = iD;
		this.CakeName = cakeName;
		this.cost = cost;
		this.type = type;
		this.quantity = quantity;
	}
	public void setCakeName(String cakeName) {
		CakeName = cakeName;
	}
	private String ID;
	 private String CakeName;
     private int cost;
     private String type;
     private int quantity;
	
     
    public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	public String getCakeName() {
		return CakeName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantityy) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "details [ID=" + ID + ", CakeName=" + CakeName + ", cost=" + cost + ", type=" + type + ", quantity=" + quantity
				+ "]";
	}
	
		}
	
	

