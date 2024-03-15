package edu.up.eng.arleed.model;

public class RoomDetails {
    String roomName;
    TemperatureDetails temp;

    public RoomDetails(String roomName) {
        this.roomName = roomName;
    }

    public RoomDetails(TemperatureDetails temp, int roomName) {
        this.temp = temp;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public TemperatureDetails getTemp() {
        return temp;
    }

    public void setTemp(TemperatureDetails temp) {
        this.temp = temp;
    }


}
