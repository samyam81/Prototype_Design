#include <iostream>
#include <vector>
#include <memory>

using namespace std;

class Book {
private:
    int bid;
    string bname;
public:
    void setBname(const string& name) {
        bname = name;
    }
    void setBid(int id) {
        bid = id;
    }
    int getBid() const {
        return bid;
    }
    string getBname() const {
        return bname;
    }
};

class Bookshop {
private:
    string shopname;
    vector<Book> books;
public:
    void setShopname(const string& name) {
        shopname = name;
    }
    string getShopname() const {
        return shopname;
    }
    void loadData() {
        for (int i = 1; i <= 10; i++) {
            Book b;
            b.setBid(i);
            b.setBname(" Book-" + to_string(i));
            books.push_back(b);
        }
    }
    vector<Book> getBooks() const {
        return books;
    }
    void removeBook(int index) {
        books.erase(books.begin() + index);
    }
    friend ostream& operator<<(ostream& os, const Bookshop& bs);
};

ostream& operator<<(ostream& os, const Bookshop& bs) {
    os << "BookShop[shopname=" << bs.shopname << ",books=[";
    for (const Book& b : bs.books) {
        os << "{bid=" << b.getBid() << ", bname=" << b.getBname() << "}, ";
    }
    os << "]]";
    return os;
}

int main() {
    Bookshop bs;
    bs.setShopname("Ross_Taylor");
    bs.loadData();

    cout << bs << endl;

    Bookshop bs1 = bs;
    bs.removeBook(2);
    bs1.setShopname("Kane_Williamson");
    cout << bs1 << endl;

    return 0;
}
