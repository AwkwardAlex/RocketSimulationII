package locations;

public enum Destination {
    SPACE(1, 1, "Space"),
    MOON(2, 38, "Moon"),
    MARS(3, 546, "Mars"),
    SUN(4, 1490, "Sun");

    private int id, distance;
    private String name;

    Destination(int id, int distance, String name) {
        this.id = id;
        this.distance = distance;
        this.name = name;
    }

    public static Destination getId(int num) {
        for (Destination planet : Destination.values()) {
            if (planet.id == num) {
                return planet;
            }
        }
        return null;
    }

    public static Destination getDestName(String name) {
        for (Destination planet : Destination.values()) {
            if (planet.name.equalsIgnoreCase(name)) {
                return planet;
            }
        }
        return null;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}


