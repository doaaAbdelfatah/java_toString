package session126;

public class MainCart {
    public static void main(String[] args) {
        Cart c = new Cart();

        Cart.Item i = c.new Item("Book" , 2 , 100);
        Cart.Item i2 = c.new Item("TV" , 1 , 5000);
        Cart.Item [] items = {i , i2};

        c.setItems(items);
    }
}
