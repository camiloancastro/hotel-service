package com.hotel.hotel_service.repository;

import com.hotel.hotel_service.entity.Hotel;
import jakarta.transaction.Transactional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

  Hotel getHotelById(UUID id);

  @Transactional
  @Modifying
  @Query("DELETE FROM Hotel h WHERE h.id = ?1")
  void deleteByHotelId(UUID id);

}
