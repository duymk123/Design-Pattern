package Solution;

public class Main {
    public static void main(String[] args) {
        Room room = new RoomBuilder()
                .setBed("bed")
                .enableWifi()
                .enableTv()
                .build();

        room.showInfo();
    }
}
