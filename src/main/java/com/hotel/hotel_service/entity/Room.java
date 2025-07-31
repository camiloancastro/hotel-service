package com.hotel.hotel_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Room {

  @Id
  @GeneratedValue
  private UUID id;

  private String roomNumber;
  private String type;
  private Integer capacity;
  private Double pricePerNight;
  private Boolean available = true;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "hotel_id", nullable = false)
  private Hotel hotel;

}
