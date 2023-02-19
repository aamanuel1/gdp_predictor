package com.worldbankdata.backend.Repository;

import com.worldbankdata.backend.Entity.PopulationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopulationRepository extends JpaRepository<PopulationEntity, Long> {

}
