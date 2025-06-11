package com.github.hotech.rooms.interfaces.rest.resources;

public record RoomResource(
        Long id,
        String fullName,
        String roomType,
        String roomStatus,
        int roomNumber,
        String roomReservation
) {
}
