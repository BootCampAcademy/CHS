package com.nbs.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nbs.persistence.domain.CHS;

@Repository
public interface CHSRepository extends JpaRepository<CHS, Long> {

}
