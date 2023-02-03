package com.wedding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.entity.Vendor;
import com.wedding.repository.VendorRepo;

@Service
public class VendorServiceImpl implements VendorService{
	@Autowired
	VendorRepo vr;

	@Override
	public Vendor RegisterVendor(Vendor vendor) {
		return vr.save(vendor);
	}

	@Override
	public List<Vendor> getAllVendors() {
		return vr.findAll();
	}

	@Override
	public Vendor getVendorById(int vid) {
		return vr.findById(vid).get();
	}

}
