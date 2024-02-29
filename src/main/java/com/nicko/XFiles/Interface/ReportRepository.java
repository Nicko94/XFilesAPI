package com.nicko.XFiles.Interface;

import com.nicko.XFiles.Entity.Report;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReportRepository extends JpaRepository<Report, Long> {
    Report findByName(String name);
}
