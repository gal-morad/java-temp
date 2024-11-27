package dal;
import org.junit.jupiter.api.Test;

import api.Room;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class RoomsDalTest {
    @Test
    void getRoomByCapacity_ShouldReturnRoomsWithCapacityLessThanOrEqual() {
        // Arrange
        Room room1 = new Room(10, "name1");
        Room room2 = new Room(20, "name2");
        Room room3 = new Room(30, "name3");
        List<Room> rooms = Arrays.asList(room1, room2, room3);
        RoomsDal roomsDal = new RoomsDal(rooms);

        // Act
        List<Room> result = roomsDal.getRoomByCapacity(20);

        // Assert
        assertEquals(2, result.size());
        assertTrue(result.contains(room1));
        assertTrue(result.contains(room2));
        assertFalse(result.contains(room3));
    }
} 