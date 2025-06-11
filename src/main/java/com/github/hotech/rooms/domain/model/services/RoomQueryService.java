package com.github.hotech.rooms.domain.model.services;

import com.github.hotech.rooms.domain.model.aggregates.Room;
import com.github.hotech.rooms.domain.model.queries.GetAllRoomsQuery;
import com.github.hotech.rooms.domain.model.queries.GetRoomByIdQuery;
import com.github.hotech.rooms.domain.model.queries.GetRoomByTypeQuery;

import java.util.List;
import java.util.Optional;

public interface RoomQueryService {
    Optional<Room> handle(GetRoomByIdQuery query);
    Optional<Room> handle(GetRoomByTypeQuery query);
    List<Room> handle(GetAllRoomsQuery query);
}
