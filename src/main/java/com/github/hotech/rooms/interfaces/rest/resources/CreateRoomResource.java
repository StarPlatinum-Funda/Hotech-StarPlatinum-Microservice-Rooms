package com.github.hotech.rooms.interfaces.rest.resources;

import java.util.Date;

public record CreateRoomResource(
        String firstName,
        String lastName,
        String type,
        String state,
        int roomNumber,
        Date initialDate,
        Date finalDate

) {
}
