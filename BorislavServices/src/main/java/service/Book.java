package service;

public class Book {
    private String bookName;
    private boolean bookReserved;
    private boolean bookPurchased;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public boolean isBookReserved() {
        return bookReserved;
    }

    public void setBookReserved(boolean bookReserved) {
        this.bookReserved = bookReserved;
    }

    public boolean isBookPurchased() {
        return bookPurchased;
    }

    public void setBookPurchased(boolean bookPurchased) {
        this.bookPurchased = bookPurchased;
    }
}
