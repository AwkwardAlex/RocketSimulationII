package cabins;

public enum CabinSet {
    ARCHIMEDES(1, "Archimedes", 2, 1, 500, 3),
    AVENGER(2, "Avenger", 3, 3, 890, 4),
    BEHEMOTH(3, "Behemoth", 5, 5, 1250, 6),
    BLITZKRIEG(4, "Blitzkrieg", 1, 1, 300, 1),
    ZENITH(5, "Zenith", 2, 2, 600, 2);

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
