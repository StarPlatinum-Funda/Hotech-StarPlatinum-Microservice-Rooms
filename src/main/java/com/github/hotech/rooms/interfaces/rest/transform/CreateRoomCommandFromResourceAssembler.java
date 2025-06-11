package com.github.hotech.rooms.interfaces.rest.transform;

import com.github.hotech.rooms.domain.model.commands.CreateRoomCommand;
import com.github.hotech.rooms.interfaces.rest.resources.CreateRoomResource;

public class CreateRoomCommandFromResourceAssembler {
    public static CreateRoomCommand toCommandFromResource(CreateRoomResource resource){
        return new CreateRoomCommand(resource.firstName(), resource.lastName(), resource.type(), resource.state(), resource.roomNumber(), resource.initialDate(),resource.finalDate());    }
}
