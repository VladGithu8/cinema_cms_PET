package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.AboutCinema.KidsGameRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KidsGameRoomRepository extends JpaRepository<KidsGameRoom, Long> {
}


