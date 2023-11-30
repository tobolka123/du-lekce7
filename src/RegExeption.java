import java.io.FileNotFoundException;
public class RegExeption extends Throwable {
    public RegExeption(Exception e) {
        super(e.getLocalizedMessage());
    }

    public RegExeption(String msg) {
        super(msg);
    }
}