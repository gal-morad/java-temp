package api;
public class RoomBookingRequest {
    private String roomName;
    private java.util.Date date;

    public String getRoomName() {
        return roomName;
    }
    
    public void setRoomName(String name) {
        this.roomName = name;
    }
    
    public java.util.Date getDate() {
        return date;
    }
    
    public void setDate(java.util.Date date) {
        this.date = date;
    }
}
