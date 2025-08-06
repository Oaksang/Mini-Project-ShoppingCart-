package Lib;

public final class Product {
    private final String productid;
    private final String productname;
    private final double price;
    
    public Product(String productid , String productname , double price){
        this.productid = productid;
        this.productname = productname;
        this.price = price;
        Checkrep();
    }
    public String getProductId(){
        return productid;
    }
    public String getProductName(){
        return productname;
    }
    public double getPrice(){
        return price;
    }
    private void Checkrep(){
        if (productid == null || productid.isEmpty()) {
            System.out.println("Product unknow");
        }
        if (productname == null || productname.isEmpty()) {
            System.out.println("Product unknow");  
        }
        if (price<0) {
            System.out.println("Price can't Negative");

        }
    }
     public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        return productid.equals(other.productid);
    }
}




