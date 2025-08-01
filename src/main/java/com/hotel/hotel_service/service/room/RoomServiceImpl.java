package com.hotel.hotel_service.service.room;

import com.hotel.hotel_service.dto.RoomRequest;
import com.hotel.hotel_service.dto.RoomResponse;
import com.hotel.hotel_service.repository.RoomRepository;
import com.hotel.hotel_service.util.mapper.HotelMapper;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoomServiceImpl implements RoomService {

  private final RoomRepository roomRepository;
  private final HotelMapper hotelMapper;

  @Override
  public RoomResponse create(RoomRequest request) {
    var room = hotelMapper.toRoom(request);
    var savedRoom = roomRepository.save(room);
    return hotelMapper.toRoomResponse(savedRoom);
  }

  @Override
  public RoomResponse update(UUID id, RoomRequest request) {
    var existingRoom = roomRepository.getRoomById(id);
    hotelMapper.updateRoomFromRequest(request, existingRoom);
    var updatedRoom = roomRepository.save(existingRoom);
    return hotelMapper.toRoomResponse(updatedRoom);
  }

  @Override
  public RoomResponse getById(UUID id) {
    var room = roomRepository.getRoomById(id);
    return hotelMapper.toRoomResponse(room);
  }

  @Override
  public void deleteById(UUID id) {
    roomRepository.deleteByRoomId(id);
  }

  @Override
  public Page<RoomResponse> getAll(Pageable pageable) {
    return roomRepository.findAll(pageable)
        .map(hotelMapper::toRoomResponse);
  }
}
