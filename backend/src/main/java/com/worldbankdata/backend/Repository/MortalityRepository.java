package com.worldbankdata.backend.Repository;

import com.worldbankdata.backend.Entity.MortalityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MortalityRepository extends JpaRepository<MortalityEntity, Long> {

}
