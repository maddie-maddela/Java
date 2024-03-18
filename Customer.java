package coffee_shop;

public class Customer {
	private String name;
	private String phoneNo;
	private String email;
	private String premium;
	private static int orderNo = 0;
	private String timeStamp;
	private String item;
	private int price;
	
	public Customer(String name, String phoneNo, String email, String premium, String timeStamp, String item, int price) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.premium = premium;
		orderNo = orderNo + 1;
		this.timeStamp = timeStamp;
		this.item = item;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		orderNo = orderNo + 1;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return getName() + ", " + getPhoneNo() + ", " + getPremium() + ", " + getOrderNo() + ", " + getTimeStamp() + ", " + getItem() + ", " + getPrice();  
	}
	
	
}
