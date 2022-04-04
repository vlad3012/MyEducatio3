package json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
    ObjectMapper mapper = new ObjectMapper();
    Flat flat = showInfoMyFlat();
    try{
        mapper.writeValue(new File("D:\\user.json"),flat);
        String jsonInString = mapper.writeValueAsString(flat);
        System.out.println(jsonInString);
        jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(flat);
        System.out.println(jsonInString);
    }catch (JsonGenerationException e){
        System.out.println("Fatal error");
    }catch (JsonMappingException e){
        System.out.println("Error");
    }catch (IOException e){
        System.out.println("Lets try again)");
    }
    }
    private static Flat showInfoMyFlat(){
        Flat flat = new Flat();
        flat.setRoomSpace(15);
        flat.setRoomSpace2(25);
        flat.setRoomSpace3(35);

        List<String> r =  new ArrayList<>();
          r.add("Kitchen");
          r.add("Bedroom");
          r.add("Living room");

          flat.setRooms(r);

          return flat;
    }
}

//    JSON to Java Object
//    ObjectMapper mapper = new ObjectMapper();
//
//		try {
//            // Convert JSON string from file to Object
//                User user = mapper.readValue(new File("G:\\user.json"), User.class);
//        System.out.println(user);
//
//        // Convert JSON string to Object
//        String jsonInString = "{\"age\":33,\"messages\":[\"msg 1\",\"msg 2\"],\"name\":\"mkyong\"}";
//        User user1 = mapper.readValue(jsonInString, User.class);
//        System.out.println(user1);
//
//        } catch (JsonGenerationException e) {
//        e.printStackTrace();
//        } catch (JsonMappingException e) {
//        e.printStackTrace();
//        } catch (IOException e) {
//        e.printStackTrace();
//        }