package json;

public class Flat {
    private int roomSpace;
    private Rooms rooms;

    public int getRoomSpace() {
        return roomSpace;
    }

    public void setRoomSpace(int roomSpace) {
        this.roomSpace = roomSpace;
    }

    public Rooms getRooms() {
        return rooms;
    }

    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }

    public void say() {
        System.out.println("My Apartment");
        System.out.println(getRoomSpace()+"," +  getRooms().getName());
    }


 static class Rooms {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}





