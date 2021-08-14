import java.time.LocalDate;

public abstract class Books {

    protected String titleOfBook;
    protected LocalDate expireDate;

    public Books(String titleOfBook, LocalDate expireDate) {
        this.titleOfBook = titleOfBook;
        this.expireDate = expireDate;
    }

    public String getTitleOfBook() {
        return titleOfBook;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }
    public abstract Result countFees ();

}
