package com.katalid.cru.meeting.meeting.repository;

import com.katalid.cru.meeting.meeting.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
