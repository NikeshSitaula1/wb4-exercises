package com.pluralsight;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void room_checkIn_getOccupied(){
        //arrange
        Room room = new Room(1, 200, false, false);
        //act
        room.checkIn();
        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

}