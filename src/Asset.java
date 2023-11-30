public class Asset {
    private static Integer nextId = 1;
    private final Integer id;
    private String des;
    private Lokace lokace;

    public Asset(String desc, Lokace lokace) {
        this(nextId++, desc, lokace);
    }

    public Asset(Integer id, String description, Lokace lokace) {
        this.id = id;
        if (id >= nextId) nextId = ++id;
        this.des = description;
        this.lokace = lokace;
    }

    public Integer getId() {
        return id;
    }

    public String getDesc() {
        return des;
    }

    public void setDescription(String description) {
        this.des = description;
    }

    public Lokace getLokace() {
        return lokace;
    }

    public void setLokace(Lokace lokace) {
        this.lokace = lokace;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "id = " + id +
                ", description='" + des + '\'' +
                ", location=" + lokace +
                '}';
    }
}