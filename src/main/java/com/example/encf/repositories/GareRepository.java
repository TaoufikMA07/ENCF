package com.example.encf.repositories;

import com.example.encf.entities.Gare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GareRepository extends JpaRepository<Gare, Long> {
}
