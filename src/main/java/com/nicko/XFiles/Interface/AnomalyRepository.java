package com.nicko.XFiles.Interface;

import com.nicko.XFiles.Entity.Anomaly;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AnomalyRepository extends JpaRepository<Anomaly, Long> {
    Anomaly findByName(String name);
    Anomaly findByType(String type);
}
