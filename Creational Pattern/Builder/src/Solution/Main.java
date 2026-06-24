package Solution;

public class Main {
    public static void main(String[] args) {
        Room room = new RoomBuilder()
                .buildBed("bed")
                .buildTv()
                .buildCabinet()
                .build();

        room.showInfo();
    }
}
