package com.nicko.XFiles.Controller;

import com.nicko.XFiles.Entity.Report;
import com.nicko.XFiles.Interface.ReportRepository;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportController {
    private final ReportRepository reportRepository;

    @Autowired
    public ReportController(ReportRepository reportRepository){
        this.reportRepository = reportRepository;
    }

    @GetMapping
    public List<Report> getAllReports(){
        return reportRepository.findAll();
    }

    //@GetMapping("/{id}")
    //public Report fetchReportByName(@PathVariable Long id){
    //    return reportRepository.findById(id);
    //}

    @PostMapping
    public Report createReport(@RequestBody Report report){
        return reportRepository.save(report);
    }
}
