package com.pluralsight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    //Creating test for checkIn
    @Test
    void checkIn_shouldMakeRoomOccupiedAndDirty(){
       //arrange
        Room room = new Room(2, 150.00, false, false);

        // Act
        room.checkIn();

        // Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());

    }
    // Creating test for Check Out
    @Test
    void checkOut_shouldNotMakeRoomOccupied(){
        Room room = new Room(2, 150.00, true, true);
        room.checkOut();
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());

    }
    // Creating test for Clean Room
    @Test
    void cleanRoom_shouldNotMakeRoomDirty(){
        Room room = new Room(2, 150.00, false, true);
        room.cleanRoom();
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());

    }
    @Test
    void checkIn_shouldNotAllowOccupiedRoom(){
        Room room = new Room(2, 150.00, true, false);
        room.checkIn();
        assertTrue(room.isOccupied());

        }

        @Test
    void checkIn_shouldNotAllowDirtyRoom(){
        Room room = new Room(2, 150.00, false, true);
        room.checkIn();
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());

        }

        @Test
        void cleanRoom_shouldNotCleanOccupiedRoom(){
        Room room = new Room(2, 150.00, true, true);
        room.cleanRoom();
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());

        }
    }
