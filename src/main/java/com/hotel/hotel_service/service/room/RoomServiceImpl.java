package com.hotel.hotel_service.service.room;

import com.hotel.hotel_service.dto.RoomRequest;
import com.hotel.hotel_service.dto.RoomResponse;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

  @Override
  public RoomResponse create(RoomRequest request) {
    return null;
  }

  @Override
  public RoomResponse update(UUID id, RoomRequest request) {
    return null;
  }

  @Override
  public RoomResponse getById(UUID id) {
    return null;
  }

  @Override
  public void deleteById(UUID id) {

  }

  @Override
  public Page<RoomResponse> getAll() {
    return null;
  }
}
