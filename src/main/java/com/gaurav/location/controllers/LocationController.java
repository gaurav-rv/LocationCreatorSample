package com.gaurav.location.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gaurav.location.entities.Location;
import com.gaurav.location.services.LocationService;
import java.util.*;

@Controller
public class LocationController {
	
	@Autowired
	LocationService locationservice;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		
		Location locationSaved = locationservice.saveLocation(location);
		String msg = "Location saved with id: "+ locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createLocation";
		
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocation(ModelMap modelMap) {
		List<Location> locations = locationservice.getAllLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
	
	@RequestMapping("deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
		Optional<Location> location = locationservice.getLocation(id);
		locationservice.deleteLocation(location.get());
		List<Location> locations = locationservice.getAllLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}
	
	
	
}
