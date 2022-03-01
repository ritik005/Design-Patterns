package Creational.PrototypeMethod;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Ware Book Shop");
        bs.loadData();

        BookShop bs2 = bs.clone();
        bs2.setShopName("Ware2 Book Store");
        
        //Here changes will reflect in bs2 store
        bs.getBooks().remove(2);

        System.out.println(bs);
        System.out.println(bs2);
    }
}
