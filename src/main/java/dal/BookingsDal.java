package dal;

import java.util.HashSet;
import java.util.Set;

public class BookingsDal {
    Set<String> bookings = new HashSet<String>();
    boolean isRoomAvailable(java.util.Date date, String roomName){
        return bookings.contains(generateBookingKey(roomName, date));
    }

    //todo add validation
    void bookRoom(String roomName, java.util.Date date){
        this.bookings.add(generateBookingKey( roomName , date));
    }

    private String generateBookingKey(String roomName, java.util.Date date){
        return roomName + "_" + date;
    }
}
