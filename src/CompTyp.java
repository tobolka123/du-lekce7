public enum CompTyp {
    LAPTOP("laptop"), DESKTOP("desktop"), TABLET("tablet");

    final String desc;

    CompTyp(String description) {
        this.desc = description;
    }

    @Override
    public String toString() {
        return desc;
    }
}