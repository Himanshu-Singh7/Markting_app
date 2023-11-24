package com.markting.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.markting.app.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead,Long> {

}
