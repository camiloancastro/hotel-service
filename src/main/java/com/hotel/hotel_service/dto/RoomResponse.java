package com.hotel.hotel_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomResponse {

  private String roomNumber;
  private String type;
  private Integer capacity;
  private Double pricePerNight;
  private Boolean available;
  private String hotelName;

}
