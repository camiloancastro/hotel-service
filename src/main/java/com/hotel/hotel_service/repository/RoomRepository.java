package com.hotel.hotel_service.repository;

import com.hotel.hotel_service.entity.Room;
import jakarta.transaction.Transactional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Integer> {

    Room getRoomById(UUID id);

    @Transactional
    @Modifying
    @Query("DELETE FROM Room r WHERE r.id = ?1")
    void deleteByRoomId(UUID id);

}
