package Creational.PrototypeMethod;

import java.util.ArrayList;
import java.util.List;

class Book {
    private int bId;
    private String bName;

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    @Override
    public String toString() {
        return "Book [bId=" + bId + ", bName=" + bName + "]";
    }   
    
}

class BookShop implements Cloneable {
    private String shopName;
    List<Book> books = new ArrayList<Book>();
    
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {

        for (int i = 1; i <= 5; i++) {
            Book b = new Book();
            b.setbId(i);
            b.setbName("book-" + i);
            getBooks().add(b);
        }

    }
    
    //Deep Cloning
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop = new BookShop();

        for(Book b : this.getBooks()) {
            shop.getBooks().add(b);
        }

        return shop;
    }

    @Override
    public String toString() {
        return "BookShop [books=" + books + ", shopName=" + shopName + "]";
    }
}
