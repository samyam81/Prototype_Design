package PrototypeDesign;

import java.util.ArrayList;
import java.util.List;

public class bookshop implements Cloneable{
    private String shopname;
    List<book> books=new ArrayList<>();
    
    public List<book> getBooks() {
        return books;
    }
    public void setBooks(List<book> books) {
        this.books = books;
    }

    public String getShopname() {
        return shopname;
    }
    public void setShopname(String shopname) {
        this.shopname = shopname;
    }
    public void loadData(){
        for(int i=1;i<=10;i++){
            book b=new book();
            b.setBid(i);
            b.setBname(" Book- "+i);
            getBooks().add(b);
        }

    }
    @Override
    public String toString(){
        return "BookShop[shopname="+ shopname +",books="+ books + "]";
    }
    @Override
    protected bookshop clone()throws CloneNotSupportedException{
        bookshop shop=new bookshop();
        
        for(book b: this.getBooks()){
                shop.getBooks().add(b);
        }

        return shop;

    }

}
