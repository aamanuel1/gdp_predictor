package com.worldbankdata.backend.Repository;

import com.worldbankdata.backend.Entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<CountryEntity, Long> {


}
