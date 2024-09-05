
public enum Day {

    MATIN(8, "Il est l'heure de se lever"),
    MIDI(12, "A table"),
    APRESMIDI(15, "Bon escalade"),
    SOIR(22, "Bonne nuit"),
    NUIT(2, "Fais de beaux rêves");

    private int heure;
    private String message;

    public int getHeure() {
        return heure;
    }

    public String getMessage() {
        return message;
    }

    Day(int heure, String message) {
        this.heure = heure;
        this.message = message;
    }
}
