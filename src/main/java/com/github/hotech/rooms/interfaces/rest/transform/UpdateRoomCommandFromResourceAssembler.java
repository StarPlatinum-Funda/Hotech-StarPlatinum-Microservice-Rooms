package com.github.hotech.rooms.interfaces.rest.transform;

import com.github.hotech.rooms.domain.model.commands.UpdateRoomCommand;
import com.github.hotech.rooms.interfaces.rest.resources.UpdateRoomResource;

public class UpdateRoomCommandFromResourceAssembler {
    public static UpdateRoomCommand toCommandFromResource(Long roomId, UpdateRoomResource resource){
        return new UpdateRoomCommand(roomId, resource.firstName(), resource.lastName(), resource.type(), resource.state(), resource.roomNumber(), resource.initialDate(), resource.finalDate());
    }
}
