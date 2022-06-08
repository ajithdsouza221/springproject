package com.saiprabhaapartment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saiprabhaapartment.entity.Room;

public interface RoomRepository extends JpaRepository<Room, String> {

}
