package Structural.Facade;

public class Main {
    public static void main(String[] args) {
        Shopkeeper sk = new Shopkeeper();
        int choice = 1;
        switch (choice) {
            case 1 :
                sk.iphoneSale();
                break;
            case 2 :
                sk.samsungSale();
                break;
        }

    }
}
