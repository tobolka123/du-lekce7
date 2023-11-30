import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Vehicle extends Asset {
    private int miles;
    private LocalDate lastOnRoad;

    public Vehicle(
            int id, String description, Lokace lokace,
            int mileage, LocalDate lastOnRoad) {
        super(id, description, lokace);
        this.miles = mileage;
        this.lastOnRoad = lastOnRoad;
    }
    public Vehicle(
            String description, Lokace lokace,
            int mileage, LocalDate lastOnRoad) {
        super(description,lokace);
        this.miles = mileage;
        this.lastOnRoad = lastOnRoad;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public LocalDate getLastOnRoad() {
        return lastOnRoad;
    }

    public void setLastOnRoad(LocalDate lastOnRoad) {
        this.lastOnRoad = lastOnRoad;
    }

    @Override
    public String toString() {
        return "Vehicle{" + getId() + ": " + getDesc() + ", " + miles + " km, lastOnRoad = " + lastOnRoad + '}';
    }
}