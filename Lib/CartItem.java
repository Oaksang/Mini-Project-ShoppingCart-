package Lib;
public class CartItem {

    private final Product product;
    private int quantity;

    public CartItem(Product product , int quantity){
        this.product = product;
        this.quantity = quantity;
    }
    public void CheckRep(){
        if (product == null) {
        throw new IllegalArgumentException("Product cannot be null");
        }if (quantity <= 0) {
        throw new IllegalArgumentException("Quantity Should More than zero");
        
        }
    }
    public Product getProduct(){
        return product;
    }
    public int getQuantity(){
        return quantity;
    }
 public void increaseQuantity(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount to increase must be greater than zero");
        }
        this.quantity += amount;
        CheckRep();
    }
}