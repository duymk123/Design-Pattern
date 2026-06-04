package Solution;

public class Room {
    private String bed;
    private boolean wifi;
    private boolean tv;
    private boolean cabinet;

    public Room(String bed, boolean wifi, Boolean tv, boolean cabinet) {
        this.bed = bed;
        this.wifi = wifi;
        this.tv = tv;
        this.cabinet = cabinet;
    }

    public String getBed() {
        return bed;
    }

    public boolean isCabinet() {
        return cabinet;
    }

    public boolean isTv() {
        return tv;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void showInfo(){
        System.out.println("Bed: " + bed);
        System.out.println("Wifi: " + (wifi? "Available" : "Not Available" ));
        System.out.println("TV: " + (tv? "Available" : "Not Available" ));
        System.out.println("Cabinet: " + (cabinet? "Available" : "Not Available"));
    }
}
