package com.nicko.XFiles.Controller;

import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/files")
public class FileController {
    @GetMapping
    public String getAllFiles(){
        // List all files for paging
        return "[FILES NOT AVAILABLE]";
    }
    @GetMapping("/{id}")
    public String getFileById(@PathVariable int id){
        return "Fuck you";
    }

}
