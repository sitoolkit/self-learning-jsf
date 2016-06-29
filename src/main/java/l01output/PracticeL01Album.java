package l01output;

public class PracticeL01Album{

    private String name;
    private String auther;
    private String price;
    private String memberprice;

    public PracticeL01Album(String name, String auther, String price, String memberprice) {
		super();
		this.name = name;
		this.auther = auther;
		this.price = price;
		this.memberprice = memberprice;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getMemberprice() {
		return memberprice;
	}
	public void setMemberprice(String memberprice) {
		this.memberprice = memberprice;
	}
}