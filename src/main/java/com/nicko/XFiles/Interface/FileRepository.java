package com.nicko.XFiles.Interface;

import com.nicko.XFiles.Entity.File;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FileRepository extends JpaRepository {
    File findByName(String name);
}
