package com.wedding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wedding.entity.Vendor;

@Repository
public interface VendorRepo extends JpaRepository<Vendor, Integer>{

}
