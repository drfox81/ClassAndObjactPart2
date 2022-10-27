import java.util.Objects;

public class Author {
    private String nameAuthorFirst;
    private String nameAuthorSecond;

    public Author(String nameAuthorFirst, String nameAuthorSecond) {
        this.nameAuthorFirst = nameAuthorFirst;
        this.nameAuthorSecond = nameAuthorSecond;
    }

    public String getNameAuthorFirst() {
        return this.nameAuthorFirst;
    }

    public String getNameAuthorSecond() {
        return this.nameAuthorSecond;
    }

    @Override
    public String toString() {
        return "Фамилия Имя (автора) - " + nameAuthorFirst + " " + nameAuthorSecond + " || ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthorFirst, author.nameAuthorFirst) && Objects.equals(nameAuthorSecond, author.nameAuthorSecond);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthorFirst, nameAuthorSecond);
    }
}