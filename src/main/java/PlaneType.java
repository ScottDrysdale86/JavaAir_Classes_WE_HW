public enum PlaneType {
    AIRBUS350 (350, 14000),
    BOEING737(200, 8000),
    BOMBARDIERQ400(80, 3200);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }
}
