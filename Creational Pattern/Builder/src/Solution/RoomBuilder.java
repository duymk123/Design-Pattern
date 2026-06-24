package Solution;

import java.io.Serializable;

public class RoomBuilder implements Builder {

    private String bed;
    private boolean wifi;
    private boolean tv;
    private boolean cabinet;


    @Override
    public Builder buildBed(String bed) {
        this.bed = bed;
        return this;
    }

    @Override
    public Builder buildWifi() {
        this.wifi = true;
        return this;
    }

    @Override
    public Builder buildTv() {
        this.tv = true;
        return this;
    }

    @Override
    public Builder buildCabinet() {
        this.cabinet = true;
        return this;
    }

    @Override
    public Room build() {
        return new Room(bed, wifi, tv, cabinet);
    }


}
