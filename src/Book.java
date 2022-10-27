import java.util.Objects;

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
    @Override
    public String toString() {
        return nameAuthor.toString() +
                "  Название книги  - " + nameBook + " || " +"  Год публикации - " + yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameAuthor, book.nameAuthor) && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, nameBook);
    }
}