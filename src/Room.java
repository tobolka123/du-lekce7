public class Room implements Lokace {
    int roomId;
    String build;

    @Override
    public String getDes() {
        String response = "Room "+ roomId;
        if (! build.isEmpty()) response +=" ("+build+")";
        return response;
    }

    public Room(int roomId, String build) {
        this.roomId = roomId;
        this.build = build;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    @Override
    public String toString() {
        return "Room{" + roomId + " " + build + '}';
    }

}