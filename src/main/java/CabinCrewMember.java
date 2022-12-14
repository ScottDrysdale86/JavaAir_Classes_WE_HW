public class CabinCrewMember {
    private String name;
    private final Rank rank;

    public CabinCrewMember(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setCrewName(String name){
        this.name = name;
    }
    public Rank getRank() {
        return rank;
    }

    public String relayMessage(String message){
        return message;
    }
}
