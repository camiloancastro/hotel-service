package com.hotel.hotel_service.util.mapper;

import com.hotel.hotel_service.dto.HotelRequest;
import com.hotel.hotel_service.dto.HotelResponse;
import com.hotel.hotel_service.dto.RoomRequest;
import com.hotel.hotel_service.dto.RoomResponse;
import com.hotel.hotel_service.entity.Hotel;
import com.hotel.hotel_service.entity.Room;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HotelMapper {

  Hotel toHotel(HotelRequest request);

  HotelResponse toHotelResponse(Hotel hotel);

  List<HotelResponse> toHotelResponseList(List<Hotel> hotels);

  Room toRoom(RoomRequest request);

  RoomResponse toRoomResponse(Room room);

  List<RoomResponse> toRoomResponseList(List<Room> rooms);

}
