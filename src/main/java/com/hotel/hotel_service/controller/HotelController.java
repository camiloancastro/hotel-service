package com.hotel.hotel_service.controller;

import com.hotel.hotel_service.dto.HotelRequest;
import com.hotel.hotel_service.dto.HotelResponse;
import com.hotel.hotel_service.service.hotel.HotelService;
import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/hotels")
public class HotelController {

  private final HotelService hotelService;

  @PostMapping(produces = "apliccation/json")
  public ResponseEntity<HotelResponse> createHotel(@RequestBody HotelRequest hotelRequest) {
    var hotelResponse = hotelService.create(hotelRequest);
    return ResponseEntity.ok(hotelResponse);
  }

  @GetMapping(value = "/{id}", produces = "application/json")
  public ResponseEntity<HotelResponse> getHotelById(@PathVariable UUID id) {
    var hotelResponse = hotelService.getById(id);
    return ResponseEntity.ok(hotelResponse);
  }

  @GetMapping(produces = "application/json")
  public ResponseEntity<Page<HotelResponse>> getUsers(Pageable pageable) {
    return ResponseEntity.ok(hotelService.getAll(pageable));
  }

  @PutMapping(value = "/{id}", produces = "application/json")
  public ResponseEntity<HotelResponse> updateHotel(@PathVariable UUID id,
      @RequestBody HotelRequest hotelRequest) {
    var hotelResponse = hotelService.update(id, hotelRequest);
    return ResponseEntity.ok(hotelResponse);
  }

  @DeleteMapping(value = "/{id}", produces = "application/json")
  public ResponseEntity<Void> deleteHotel(@PathVariable UUID id) {
    hotelService.deleteById(id);
    return ResponseEntity.noContent().build();
  }


}
