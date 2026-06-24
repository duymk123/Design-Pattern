package Solution;

public interface Builder {

    Builder buildBed(String bed);
    Builder buildWifi();
    Builder buildTv();
    Builder buildCabinet();
    Room build();
}
