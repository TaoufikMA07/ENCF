package com.example.encf.repositories;

import com.example.encf.entities.Arret;
import com.example.encf.entities.Ligne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArretRepository extends JpaRepository<Arret, Long> {
}
