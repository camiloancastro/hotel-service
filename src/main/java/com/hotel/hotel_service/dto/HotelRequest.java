package com.hotel.hotel_service.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelRequest {

  private String name;
  private String address;
  private String city;
  private String country;
  private boolean enabled;

  private List<RoomRequest> roomRequest;

}
