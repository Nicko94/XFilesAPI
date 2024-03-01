package com.nicko.XFiles.Interface;

import com.nicko.XFiles.Entity.Report;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReportRepository extends JpaRepository<Report, Long> {
    Report findReportById(Long id);
    Report findReportDate(String date);
    Report findReportByTitle(String title);
    Report findReportByType(String type);
    Report findReportByAnomaly(String anomaly);
    Report findReportByStaff(String staff);
}
