public class Employ implements Lokace {
    private String first;
    private String secName;
    private String job;

    public Employ(String first, String secName, String job) {
        this.first = first;
        this.secName = secName;
        this.job = job;
    }

    @Override
    public String getDes() {
        return first + " "+ secName+ " ("+ job +")";
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employ{" + first + ' ' + secName + " (" + job + ')' + '}';
    }
}