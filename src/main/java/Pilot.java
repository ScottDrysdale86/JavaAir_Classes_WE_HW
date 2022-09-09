public class Pilot {

    private String name;
    private final Rank rank;
    private String licenseNumber;

    public Pilot(String name, Rank rank, String licenseNumber) {
        this.name = name;
        this.rank = rank;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return this.name;
    }

    public Rank getRank() {
        return this.rank;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public void setPilotName(String name) {
        this.name = name;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String flyPlane(){
        return "I am flying the plane";
    }
}
