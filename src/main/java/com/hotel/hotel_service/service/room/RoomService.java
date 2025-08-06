package com.hotel.hotel_service.service.room;

import com.hotel.hotel_service.dto.RoomRequest;
import com.hotel.hotel_service.dto.RoomResponse;
import com.hotel.hotel_service.service.CrudApiHandler;
import java.util.List;
import java.util.UUID;

public interface RoomService extends CrudApiHandler<RoomRequest, RoomResponse> {

  RoomResponse addRoomToHotel(UUID hotelId, RoomRequest roomRequest);

  List<RoomResponse> getRoomsByHotelId(UUID hotelId);

}
