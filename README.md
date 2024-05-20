**Readme File: Prototype Bookshop**

---

**Description:**

This project demonstrates a simple implementation of a bookshop system using Kotlin. It includes classes for managing books and bookshops, with functionality for loading data, removing books, and creating copies of bookshops.

---

**Files:**

1. **Book.kt:** Defines the `Book` class representing individual books in the bookshop.

2. **Bookshop.kt:** Defines the `Bookshop` class representing the bookshop entity, including methods for loading data, removing books, creating copies, and overriding `toString()` for easy printing.

3. **Main.kt:** Contains the `main()` function demonstrating the usage of the `Bookshop` class and its functionalities.

---

**Usage:**

1. Clone or download the project files.

2. Open the project in a Kotlin-compatible IDE or text editor.

3. Compile and run the `Main.kt` file to see the demonstration of the bookshop system.

---

**Functionality:**

- **Load Data:** The `loadData()` function populates the bookshop with a set of sample books.

- **Remove Book:** The `removeBook(index: Int)` function allows the removal of a book from the bookshop based on its index.

- **Copy Bookshop:** The `copy()` function creates a deep copy of the bookshop, including all books.

---

**Example:**

```
val bs = Bookshop()
bs.shopname = "Ross_Taylor"
bs.loadData()

println(bs)

val bs1 = bs.copy()
bs.removeBook(2)
bs1.shopname = "Kane_Williamson"
println(bs1)
```

This example creates a bookshop, loads data, prints its contents, creates a copy of the bookshop, removes a book from the original bookshop, updates the copied bookshop's name, and prints the copied bookshop.

---

**Author:**

Samyam.81

---

Feel free to modify and extend this project as needed for your own purposes!

---

**Note:** Ensure you have Kotlin installed on your system to run the project. If not, refer to the Kotlin documentation for installation instructions.
