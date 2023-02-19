package com.worldbankdata.backend.Repository;

import com.worldbankdata.backend.Entity.LiteracyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LiteracyRepository extends JpaRepository<LiteracyEntity, Long> {

}
