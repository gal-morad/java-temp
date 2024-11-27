public class BookingsDal {
    Set<string> bookings = new Set();
    boolean isRoomAvailable(java.util.Date date, string roomName){
        return bookings.has(generateBookingKey(roomName, date));
    }

    boolean bookRoom(string roomName, java.util.Date date){
        this.bookings.add(generateBookingKey( roomName , date));
    }

    private generateBookingKey(string roomName, java.util.Date date){
        return roomName + "_" + date;
    }
}
