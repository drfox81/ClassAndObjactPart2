import java.util.Objects;

public class BookServis {

    public BookServis(){

    }
    public String toString(Book book){
        return "Автор - " + book.getNameAuthor().getNameAuthorFirst() + " "+
                book.getNameAuthor().getNameAuthorSecond() +" || Название книги - " + book.getNameBook() +
                " || Год публикации - " + book.getYearPublication();
    }

}
