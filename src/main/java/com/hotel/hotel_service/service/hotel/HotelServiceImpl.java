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
    var hotel = hotelMapper.toHotel(request);
    var savedHotel = hotelRepository.save(hotel);
    return hotelMapper.toHotelResponse(savedHotel);
  }

  @Override
  public HotelResponse update(UUID id, HotelRequest request) {
    var existingHotel = hotelRepository.getHotelById(id);
    hotelMapper.updateHotelFromRequest(request, existingHotel);
    var updatedHotel = hotelRepository.save(existingHotel);
    return hotelMapper.toHotelResponse(updatedHotel);
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
