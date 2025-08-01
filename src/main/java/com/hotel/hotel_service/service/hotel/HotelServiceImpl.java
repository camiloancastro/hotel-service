package com.hotel.hotel_service.service.hotel;

import com.hotel.hotel_service.dto.HotelRequest;
import com.hotel.hotel_service.dto.HotelResponse;
import com.hotel.hotel_service.repository.HotelRepository;
import com.hotel.hotel_service.util.mapper.HotelMapper;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HotelServiceImpl implements HotelService{

  private final HotelRepository hotelRepository;
  private final HotelMapper hotelMapper;

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
    var hotel = hotelRepository.getHotelById(id);
    return hotelMapper.toHotelResponse(hotel);
  }

  @Override
  public void deleteById(UUID id) {
    hotelRepository.deleteByHotelId(id);
  }

  @Override
  public Page<HotelResponse> getAll(Pageable pageable) {
    return hotelRepository.findAll(pageable)
        .map(hotelMapper::toHotelResponse);
  }

}
