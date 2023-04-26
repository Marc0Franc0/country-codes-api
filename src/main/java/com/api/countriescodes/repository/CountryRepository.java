package com.api.countriescodes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.countriescodes.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long>{
}
 