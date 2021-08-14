import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

       Details book1= new Details("DD", LocalDate.of(2021, 8, 2));
        Details book2 = new Details("CC", LocalDate.of(2021, 8, 10));
        Details book3 = new Details("BB", LocalDate.of(2021, 10, 22));

        book2.countFees();
    }
}
