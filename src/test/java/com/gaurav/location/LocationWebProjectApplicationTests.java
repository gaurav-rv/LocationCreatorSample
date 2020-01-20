package com.gaurav.location;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gaurav.location.entities.Location;
import com.gaurav.location.repos.LocationRepository;

@SpringBootTest
class LocationWebProjectApplicationTests {

	/*
	 * @Test void contextLoads() { }
	 */
	@Autowired
	public LocationRepository locationrepository;

	@Test
	public void testCreateLocation() {
		Location location = new Location();
		location.setId(1);
		location.setName("Bangalore");
		location.setCode("BLR");
		location.setType("Urban");
		locationrepository.save(location);
		
	}
	
	@Test
	public void testGetAllLocation() {
		System.out.print(locationrepository.toString());
	}
}
