package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.TicketPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketPriceRepository extends JpaRepository<TicketPrice, Long> {
}




