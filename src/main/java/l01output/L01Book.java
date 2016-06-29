package l01output;

public class L01Book{

    private String name;
    private String auther;
    private String price;

    public L01Book(String name,String auther,String price){
        this.name=name;
        this.auther=auther;
        this.price=price;
    }

    public String getName() {
        return name;
    }
    public String getAuther() {
        return auther;
    }
    public String getPrice() {
        return price;
    }
}