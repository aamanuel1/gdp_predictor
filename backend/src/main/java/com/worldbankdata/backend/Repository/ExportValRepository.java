package com.worldbankdata.backend.Repository;

import com.worldbankdata.backend.Entity.ExportValEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExportValRepository extends JpaRepository<ExportValEntity, Long> {
}
