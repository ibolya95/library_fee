import java.awt.print.Book;
import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

        Books book1 = new Details("DD", LocalDate.of(2021, 8, 2));
        Books book2 = new Details("CC", LocalDate.of(2021, 8, 10));
        Books book3 = new Details("BB", LocalDate.of(2021, 10, 22));

        print(book1);
        print(book2);
        print(book3);
    }

    private static void print(Books books) {
        Result result = books.countFees();
        LocalDate today = LocalDate.now();

        if (books.getExpireDate().isAfter(today)) {
            notExpiredBook(result.getTitle(), result.getNumberOfDay());
        } else if (books.getExpireDate().isEqual(today)) {
            bookInTime();
        } else if (books.getExpireDate().isBefore(today)) {
            expiredBook(result.getNumberOfDay(), result.getFee());
        }

    }

    /*
            +36204379461

            daabbcc57@gmail.com

            alkhniab.saif@gmail.com

            sayfshalan@gmail.com*/

    private static void notExpiredBook(String title, long numberOfDay) {
        System.out.println("A " + title + " című könyv még nem járt le.\n" +
                "A lejáratig hátralévő napok száma: " + Math.abs(numberOfDay) + " nap.");
    }

    private static void bookInTime() {
        System.out.println("Még nincs büntetés. HOZD VISSZA A KÖNYVET MÉG MA!");
    }

    private static void expiredBook(long numberOfDay, long fee) {
        System.out.println("A könyv lejárt " + numberOfDay + " nappal. A büntetés összege: " + fee + " forint");
    }

}
