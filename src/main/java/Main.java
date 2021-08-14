import jdk.vm.ci.meta.Local;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

       Details book1= new Details("DD", LocalDate.of(2021, 8, 2));
        Details book2 = new Details("CC", LocalDate.of(2021, 8, 10));
        Details book3 = new Details("BB", LocalDate.of(2021, 10, 22));

        book3.countFees(book3.getTitleOfBook(), book3.getExpireDate());
    }
}
