package dal;

import java.util.List;
import java.util.stream.Collectors;

import api.Room;

public class RoomsDal {
    private List<Room> rooms;
    
    public RoomsDal(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getRoomByCapacity(int capacity){
        return rooms.stream()
            .filter(room -> room.getCapacity() <= capacity)
            .collect(Collectors.toList());
    }
}
