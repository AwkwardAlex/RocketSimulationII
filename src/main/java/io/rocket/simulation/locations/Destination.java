package io.rocket.simulation.locations;

public enum Destination {
    SPACE(1, 1, "Space"),
    MOON(2, 384, "Moon"),
    MARS(3, 54600, "Mars"),
    SUN(4, 149000, "Sun"),
    JUPITER(5, 600000, "Jupiter");

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

//    public static Destination getDestName(String name) {
//        for (Destination planet : Destination.values()) {
//            if (planet.name.equalsIgnoreCase(name)) {
//                return planet;
//            }
//        }
//        return null;
//    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}


