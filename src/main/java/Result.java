public class Result {
   private long fee;
   private long numberOfDay;
   private String title;

    public Result(long fee, long numberOfDay, String title) {
        this.fee = fee;
        this.numberOfDay = numberOfDay;
        this.title = title;
    }

    public long getFee() {
        return fee;
    }

    public long getNumberOfDay() {
        return numberOfDay;
    }

    public String getTitle() {
        return title;
    }
}
