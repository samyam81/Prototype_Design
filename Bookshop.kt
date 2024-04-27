// package ProtoType
class Bookshop {
    var shopname: String = ""
    var books: MutableList<Book> = mutableListOf()

    fun loadData() {
        for (i in 1..10) {
            val b = Book().apply {
                bid = i
                bname = "Book-$i"
            }
            books.add(b)
        }
    }

    fun removeBook(index: Int) {
        books.removeAt(index)
    }

    fun copy(): Bookshop {
        val copiedShop = Bookshop()
        copiedShop.shopname = this.shopname
        copiedShop.books.addAll(this.books.map { it.copy() })
        return copiedShop
    }

    override fun toString(): String {
        return "BookShop[shopname=$shopname,books=$books]"
    }
}
