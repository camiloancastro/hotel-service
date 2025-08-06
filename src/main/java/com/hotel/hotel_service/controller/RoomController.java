package com.hotel.hotel_service.controller;

import com.hotel.hotel_service.service.room.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RoomController {

  private final RoomService roomService;

}
