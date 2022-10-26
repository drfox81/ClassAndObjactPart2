public class Book {
    private Author nameAuthor;
    private String nameBook;
    private int yearPublication;

    public Book(Author nameAuthor, String nameBook, int yearPublication) {
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;
        this.nameAuthor = nameAuthor;
    }

    public Author getNameAuthor() {
        return this.nameAuthor;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}