public class Main {
    public static void main(String[] args) {
        Author first = new Author("Толстой", "Лев");
        Book bookOne = new Book(first, "Война и мир", 2010);
        Author second = new Author("Горький", "Максим");
        Book bookTwo = new Book(second, "Вий", 1998);
        Book bookThree = new Book(first, "Война и мир", 2010);
        System.out.println(bookOne.toString());
        System.out.println(bookTwo.toString());
        bookTwo.setYearPublication(2020);
        System.out.println(bookTwo.toString());

        BookServis bookServis = new BookServis();
        System.out.println(bookServis.toString(bookOne));
        System.out.println("Результат сравнения книг - " + bookOne.equals(bookThree));
        System.out.println("Результат сравнения авторов книг - " + first.equals(second));
        System.out.println(first.hashCode() + " || " + second.hashCode());
        System.out.println(bookOne.hashCode() + " || " + bookThree.hashCode());


    }
}