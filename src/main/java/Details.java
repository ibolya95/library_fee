
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Details extends Books {

    public Details(String titleOfBook, LocalDate expireDate) {
        super(titleOfBook, expireDate);
    }

    public Result countFees () {
        LocalDate today = LocalDate.now();
        long feePerDays = 5;
        long numberOfDays = ChronoUnit.DAYS.between(expireDate, today);
        long fee = feePerDays*numberOfDays;
            return new Result(fee, numberOfDays, titleOfBook);

    }
}
