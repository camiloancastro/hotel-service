package com.hotel.hotel_service.dto;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelResponse {

  private UUID id;
  private String name;
  private String address;
  private String city;
  private String country;
  private boolean enabled;

  private RoomResponse roomResponse;

}
