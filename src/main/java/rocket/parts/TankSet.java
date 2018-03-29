package rocket.parts;

public enum TankSet {
    MINIMAL(1, "Minimal", 5, 5, 300, 100),
    SMALL(2, "Small", 7, 7, 500, 260),
    MEDIUM(3, "Medium", 9, 9, 700, 570),
    LARGE(4, "Large", 11, 11, 900, 1000),
    MASSIVE(5, "Massive", 13, 13, 1100, 1700);

    private String name;
    private int id, weight, capacity;
    private double height, width;

    TankSet(int id, String name, double height, double width, int weight, int capacity) {
        this.name = name;
        this.id = id;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.capacity = capacity;
    }
    public static TankSet getId(int num) {
        for (TankSet set : TankSet.values()) {
            if (set.id == num) {
                return set;
            }
        }
        return null;
    }

    public double getVolume() {
        return (Math.PI * Math.pow((width / 2), 2) * height);
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }
}
