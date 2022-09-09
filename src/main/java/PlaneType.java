public enum PlaneType {
    AIRBUS350 (350, 14000),
    BOEING737(200, 8000),
    BOMBARDIERQ400(80, 3200);

    public final int capacity;
    public final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }
}
