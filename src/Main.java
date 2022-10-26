public class Main {
    public static void main(String[] args) {
        Author first = new Author("Толстой", "Лев");
        System.out.println("Автор первой книги - " + first.getNameAuthorFirst() + " " + first.getNameAuthorSecond());
        Book bookOne = new Book(first, "Война и мир", 2010);
        System.out.println("Год публикации - " + bookOne.getYearPublication());
        bookOne.setYearPublication(2012);
        System.out.println("Год публикации новый - " + bookOne.getYearPublication());
        System.out.println("Фамилия автора - " + bookOne.getNameAuthor().getNameAuthorFirst());
        System.out.println("Имя автора - " + bookOne.getNameAuthor().getNameAuthorSecond());
        System.out.println();

        Author second = new Author("Горький", "Максим");
        System.out.println("Автор второй книги -  " + second.getNameAuthorFirst() + " " + second.getNameAuthorSecond());
        Book bookTwo = new Book(second, "Вий", 1998);
    }

}