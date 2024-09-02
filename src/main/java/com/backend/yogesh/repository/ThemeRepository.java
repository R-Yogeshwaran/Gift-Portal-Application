package com.backend.yogesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backend.yogesh.model.Theme;

@Repository
public interface ThemeRepository extends JpaRepository<Theme, String> {
   
}