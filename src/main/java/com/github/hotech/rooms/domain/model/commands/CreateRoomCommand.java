package com.github.hotech.rooms.domain.model.commands;

import java.util.Date;

public record CreateRoomCommand(String firstName, String lastName, String type, String Status, int roomNumber, Date initialDate, Date finalDate) {
}
