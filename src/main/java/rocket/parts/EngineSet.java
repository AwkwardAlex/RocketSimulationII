package rocket.parts;

public enum EngineSet {

    RAPTOR(1, "Raptor", 2, 1, 300, 3000, 25, 300),
    DRACO(2, "Draco", 2, 3, 370, 4500, 40, 600),
    MERLIN(3, "Merlin", 3, 2, 400, 6000, 45, 600),
    SUPERDRACO(4, "SuperDraco", 4, 4, 85000, 800, 60, 1100),
    KESTREL(5, "Kestrel", 4, 5, 800, 10000, 70, 1800);

    private String name;
    private int id, height, width, weight, power, fuelConsumption, tankSpace;

    EngineSet(int id, String name, int height, int width, int weight, int power, int fuelConsumption, int tankSpace) {
        this.name = name;
        this.id = id;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.tankSpace = tankSpace;
    }
    public static EngineSet getId(int num) {
        for (EngineSet set : EngineSet.values()) {
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

    public int getPower() {
        return power;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getTankSpace() {
        return tankSpace;
    }
}
