package objects;

public class Item {
    private int price;
    private int stock;

    public Item(){

    }
    public void adjustPrice(int price){
        this.price=price;
    }
    public void adjustStock(int stock){
        this.stock=stock;
    }
    public int getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }
}
