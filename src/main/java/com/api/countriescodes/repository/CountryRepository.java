package com.api.countriescodes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api.countriescodes.model.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country,Long>{
}
 