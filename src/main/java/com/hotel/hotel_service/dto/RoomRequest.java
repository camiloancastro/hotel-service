package com.hotel.hotel_service.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RoomRequest {

  private String roomNumber;
  private String type;
  private Integer capacity;
  private Double pricePerNight;
  private Boolean available;

}
