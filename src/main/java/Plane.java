public class Plane {
    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public String getPlaneName() {
        return this.planeType.name();
    }

    public int getPlaneCapacity(){
        return this.planeType.capacity;
    }

    public int getPlaneWeight(){
        return this.planeType.totalWeight;
    }
}
