fun main() {
    val bs = Bookshop()
    bs.shopname = "Ross_Taylor"
    bs.loadData()

    println(bs)

    val bs1 = bs.copy()
    bs.removeBook(2)
    bs1.shopname = "Kane_Williamson"
    println(bs1)
}
