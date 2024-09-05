
public class Main {
    public static void main(String[] args) {

        // Day moment = Day.MATIN;
        // System.out.println(moment.name());

        // moment = Day.NUIT;
        // System.out.println("Nous somme actuellement le " + moment.name().toLowerCase() + " il est actuellement : " + moment.getHeure() + "h, " + moment.getMessage());

        for (Day moment : Day.values()) {
            if (!moment.equals(Day.SOIR)) {
        System.out.println("Nous somme actuellement le " + moment.name().toLowerCase() + " il est actuellement : " + moment.getHeure() + "h, " + moment.getMessage());
            }
        }
    }
}
