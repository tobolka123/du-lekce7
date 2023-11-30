import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Comp extends Asset {
    private CompTyp type;

    public Comp(int id, String desc, Lokace lokace, CompTyp type) {
        super(id, desc, lokace);
        this.type = type;
    }

    public Comp(String desc, Lokace lokace, CompTyp type) {
        super(desc, lokace);
        this.type = type;
    }

    public CompTyp getType() {
        return type;
    }

    public void setType(CompTyp type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Computer{" +
                getId() +
                ": " + getDesc() +
                " (" + type +
                ")}";
    }
}