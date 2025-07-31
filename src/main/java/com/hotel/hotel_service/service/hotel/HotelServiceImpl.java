package com.hotel.hotel_service.service.hotel;

import com.hotel.hotel_service.dto.HotelRequest;
import com.hotel.hotel_service.dto.HotelResponse;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService{

  @Override
  public HotelResponse create(HotelRequest request) {
    return null;
  }

  @Override
  public HotelResponse update(UUID id, HotelRequest request) {
    return null;
  }

  @Override
  public HotelResponse getById(UUID id) {
    return null;
  }

  @Override
  public void deleteById(UUID id) {

  }

  @Override
  public Page<HotelResponse> getAll() {
    return null;
  }


}
