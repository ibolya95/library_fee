
import java.awt.print.Book;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;


public class Details extends Books {

    public Details(String titleOfBook, LocalDate expireDate) {
        super(titleOfBook, expireDate);
    }

    Books books = new Books(getTitleOfBook(), getExpireDate());

    public void countFees (String title, LocalDate expireDate) {
        LocalDate today = LocalDate.now();
        long feePerDays = 5;
        long numberOfDays = ChronoUnit.DAYS.between(expireDate, today);
        long fee = feePerDays*numberOfDays;

        if(expireDate.isAfter(today)) {
            System.out.println("A " + title + " című könyv még nem járt le. \n " +
                    "A lejáratig hátralévő napok száma: " + numberOfDays);
        } else if(expireDate.isEqual(today)) {
            System.out.println("Még nincs büntetés. HOZD VISSZA A KÖNYVET MÉG MA!");
        } else if(expireDate.isBefore(today)) {
            System.out.println("A könyv lejárt " + numberOfDays + " nappal. A büntetés összege: " + fee + " forint");
        }
    }
}
