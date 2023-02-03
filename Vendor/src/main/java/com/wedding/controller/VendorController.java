package com.wedding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wedding.entity.Vendor;
import com.wedding.service.VendorService;

@RestController
@CrossOrigin(origins = "*")
public class VendorController {
	@Autowired
	VendorService vs;
	
	@PostMapping("/vendors/vendor")
	public Vendor RegisterVendor(@RequestBody Vendor vendor) {
		return vs.RegisterVendor(vendor);
	}
	
	@GetMapping("/vendors/vendors")
	public List<Vendor> getAllVendors() {
		return vs.getAllVendors();
	}
	
	@GetMapping("/vendors/vendor/{vid}")
	public Vendor getVendorById(@PathVariable("vid") int vid) {
		return vs.getVendorById(vid);
	}

}
