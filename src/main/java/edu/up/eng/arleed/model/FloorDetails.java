package edu.up.eng.arleed.model;

import java.util.List;

public class FloorDetails {
    int floorNum;
    List<RoomDetails> rooms;

    public FloorDetails(int floorNum) {
        this.floorNum = floorNum;
    }

    public FloorDetails(List<RoomDetails> rooms, int floorNum) {
        this.rooms = rooms;
    }

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public List<RoomDetails> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDetails> rooms) {
        this.rooms = rooms;
    }
}
