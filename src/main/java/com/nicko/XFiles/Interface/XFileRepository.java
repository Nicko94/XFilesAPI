package com.nicko.XFiles.Interface;

import com.nicko.XFiles.Entity.XFile;
import com.nicko.XFiles.Entity.Anomaly;
import com.nicko.XFiles.Entity.Report;

import org.springframework.data.jpa.repository.JpaRepository;

public interface XFileRepository extends JpaRepository<XFile, Long> {
    XFile findXFileRepositoryById(Long id);
    XFile findByAnomaly(Anomaly anomaly);
    XFile findByReport(Report report);
}
