package enums;

public enum Hobby {
    Sports("Sports"),
    Reading("Reading"),
    Music("Music");

    private String value;

    Hobby(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
