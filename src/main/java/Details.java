
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Details extends Books {

    public Details(String titleOfBook, LocalDate expireDate) {
        super(titleOfBook, expireDate);
    }

    public void countFees () {
        LocalDate today = LocalDate.now();
        long feePerDays = 5;
        long numberOfDays = ChronoUnit.DAYS.between(expireDate, today);
        long fee = feePerDays*numberOfDays;

        if(expireDate.isAfter(today)) {
            System.out.println("A " + titleOfBook + " című könyv még nem járt le.\n" +
                    "A lejáratig hátralévő napok száma: " + Math.abs(numberOfDays) + " nap." );
        } else if(expireDate.isEqual(today)) {
            System.out.println("Még nincs büntetés. HOZD VISSZA A KÖNYVET MÉG MA!");
        } else if(expireDate.isBefore(today)) {
            System.out.println("A könyv lejárt " + numberOfDays + " nappal. A büntetés összege: " + fee + " forint");
        }
    }
}
