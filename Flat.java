package json;

import java.util.List;

public class Flat {
    private int roomSpace;
    private int roomSpace2;
    private int roomSpace3;
    private List<String> rooms;

    public int getRoomSpace() {
        return roomSpace;
    }

    public void setRoomSpace(int roomSpace) {
        this.roomSpace = roomSpace;
    }

    public int getRoomSpace2() {
        return roomSpace2;
    }

    public void setRoomSpace2(int roomSpace2) {
        this.roomSpace2 = roomSpace2;
    }

    public int getRoomSpace3() {
        return roomSpace3;
    }

    public void setRoomSpace3(int roomSpace3) {
        this.roomSpace3 = roomSpace3;
    }

    public List<String> getRooms() {
        return rooms;
    }

    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "roomSpace=" + roomSpace +
                ", roomSpace2=" + roomSpace2 +
                ", roomSpace3=" + roomSpace3 +
                ", rooms=" + rooms +
                '}';
    }
}





