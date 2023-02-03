package com.wedding.service;

import java.util.List;

import com.wedding.entity.Vendor;

public interface VendorService {
	
	public Vendor RegisterVendor(Vendor vendor);
	public List<Vendor> getAllVendors();
	public Vendor getVendorById(int vid);

}
