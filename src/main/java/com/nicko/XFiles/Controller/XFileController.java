package com.nicko.XFiles.Controller;

import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.nicko.XFiles.Entity.XFile;
import com.nicko.XFiles.Interface.XFileRepository;

@RestController
@RequestMapping("/files")
public class XFileController {
    private final XFileRepository xFileRepository;
    @Autowired
    public XFileController(XFileRepository xFileRepository){
        this.xFileRepository = xFileRepository;
    }
    @GetMapping
    public List<XFile> getAllFiles(){
        return xFileRepository.findAll();
    }
    @GetMapping("/{id}")
    public XFile getFileById(@PathVariable Long id){
        return xFileRepository.findXFileRepositoryById(id);
    }

}
