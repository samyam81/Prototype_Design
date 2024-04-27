// package ProtoType

class Book(var bid: Int = 0, var bname: String = "") {
    fun copy(): Book {
        return Book(this.bid, this.bname)
    }
}
