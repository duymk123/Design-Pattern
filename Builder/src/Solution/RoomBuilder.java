package Solution;

public class RoomBuilder {
    private String bed;
    private boolean wifi;
    private boolean tv;
    private boolean cabinet;

    public RoomBuilder setBed(String bed) {
        this.bed = bed;
        return this;
    }

    public RoomBuilder enableWifi() {
        this.wifi = true;
        return this;
    }

    public RoomBuilder enableTv() {
        this.tv = true;
        return this;
    }

    public RoomBuilder enableCabinet() {
        this.cabinet = true;
        return this;
    }

    public Room build() {
        return new Room(bed, wifi, tv, cabinet);
    }


}
