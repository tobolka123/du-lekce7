import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AssetManager manager = new AssetManager();
        Room parking = new Room(10, "garáže");
        manager.add(new Vehicle("Ředitelská limuzína", parking, 58161, LocalDate.now()));
        Employ david = new Employ("David", "Dvořák",  "Senior developer");
        manager.add(new Comp("Laptop pro vývoj", david, CompTyp.LAPTOP));
        System.out.println("===\n"+manager);
    }

}