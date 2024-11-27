package dal;

public class RoomsDal {
    private List<Room> rooms;
    
    public RoomsDal(List<Room> rooms) {
        this.rooms = rooms;
    }

    public getRoomByCapaciity(int capacity){
        return rooms.stream()
            .filter(room -> room.getCapacity() <= capacity)
            .collect(Collectors.toList());
    }
}
