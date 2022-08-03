package Week2.ClassDemo;

public class Books {

    String title;
    String isbn;
    int year;

    Books(String title, String isbn, int year){
        this.title = title;
        this.isbn = isbn;
        this.year = year;
    }

    public void describeBook(){
        System.out.printf("Title: %s\nISBN: %s\nYear: %d\n", title, isbn, year);
    }
    
}
