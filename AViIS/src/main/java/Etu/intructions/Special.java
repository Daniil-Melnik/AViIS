package Etu.intructions;

public enum Special {
    NOP("1001000"),
    SF("1001001"),
    CF("1001010");

    private final String description;

    Special(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
