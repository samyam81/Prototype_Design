package PrototypeDesign;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        bookshop bs= new bookshop();
        bs.setShopname("Ross_Taylor");
        bs.loadData();
       

        System.out.println(bs);

        bookshop bs1=bs.clone();
        bs.getBooks().remove(2);
        bs1.setShopname("Kane_Williamson");
        System.out.println(bs1);
    }
}
