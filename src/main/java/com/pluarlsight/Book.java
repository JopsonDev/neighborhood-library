package com.pluarlsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }
    public int getId() {
        return id;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
    public String getTitle() {
        return title;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    //method checkOut(name) = the books checkedOutTo variable should be set to the name provided
    // and the isCheckedOut varible should be set to true

    //method checkIn = checkedOutTo should be set too "" && isCheckedOut should be false
}
