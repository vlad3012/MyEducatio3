package json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Flat.Rooms rooms = new Flat.Rooms();
        rooms.setName("living room");
        rooms.setName("study");
        Flat flat = new Flat();
        flat.setRoomSpace(30);
        flat.setRoomSpace(15);
        flat.setRooms(rooms);

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(flat);

        Flat newFlat = mapper.readValue(jsonString,Flat.class);
        newFlat.say();
        System.out.println();
    }
}
