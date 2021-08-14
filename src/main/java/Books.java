import java.time.LocalDate;

public class Books {

    private String titleOfBook;
    private LocalDate expireDate;

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


}
