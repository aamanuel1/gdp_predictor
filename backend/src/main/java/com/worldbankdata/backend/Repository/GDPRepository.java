package com.worldbankdata.backend.Repository;

import com.worldbankdata.backend.Entity.GDPEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GDPRepository extends JpaRepository<GDPEntity, Long> {
}
