package com.api.countriescodes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.countriescodes.model.Code;

@Repository
public interface CodeRepository extends JpaRepository<Code,Long> {
    boolean existsByCode(String code);
    Code findByCode(String code);
}
