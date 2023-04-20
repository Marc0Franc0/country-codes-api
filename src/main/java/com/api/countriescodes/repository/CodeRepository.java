package com.api.countriescodes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.api.countriescodes.model.Code;

@Repository
public interface CodeRepository extends CrudRepository<Code,Long> {

}
