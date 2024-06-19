// Library.java
class Library {
    // Instance variables
    private String bookTitle;
    private String author;

    // Static variable
    private static String libraryName = "The Library";

    // Parameterized constructor
    public Library(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
    }

    // Default constructor
    public Library() {
        this.bookTitle = "Unknown";
        this.author = "Unknown";
    }

    // Static method
    public static String getLibraryName() {
        return libraryName;
    }

    // Instance method
    public void displayBookInfo() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
    }
}

// Main.java
public class LibraryCls {
    public static void main(String[] args) {
        // Create instances of Library using different constructors
        Library book1 = new Library("Java Complete Reference", "Herbert Schildt");
        Library book2 = new Library();

        // Display book information using instance method
        book1.displayBookInfo();
        System.out.println();
        book2.displayBookInfo();

        // Display library name using static method
        System.out.println("\nLibrary Name: " + Library.getLibraryName());
    }
}
