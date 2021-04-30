package com.pet.project.cinemacms.Repository;

import com.pet.project.cinemacms.Models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}



