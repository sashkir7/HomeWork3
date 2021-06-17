package enums;

public enum Sex {
    Male("Male"),
    Female("Female"),
    Other("Other");

    private String value;

    Sex(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}