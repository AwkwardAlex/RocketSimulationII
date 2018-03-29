package rocket.parts;

public enum CabinSet {
    ARCHIMEDES(2, "Archimedes", 2, 1, 500, 3),
    AVENGER(4, "Avenger", 3, 3, 890, 4),
    BEHEMOTH(5, "Behemoth", 5, 5, 1250, 6),
    BLITZKRIEG(1, "Blitzkrieg", 1, 1, 300, 1),
    ZENITH(3, "Zenith", 2, 2, 600, 2);

    public String name;
    private int id, height, width, weight, capacity;

    CabinSet(int id, String name, int height, int width, int weight, int capacity) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.capacity = capacity;
    }
    public static CabinSet getId(int num) {
        for (CabinSet set : CabinSet.values()) {
            if (set.id == num) {
                return set;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }
}
