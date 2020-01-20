package com.gaurav.location.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.location.entities.Location;
import com.gaurav.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository repository;
	
	@Override
	public Location saveLocation(Location location) {
		
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		// TODO Auto-generated method stub
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		// TODO Auto-generated method stub
		repository.delete(location);

	}

	@Override
	public Optional<Location> getLocation(int id) {
		// TODO Auto-generated method stub
		
		return repository.findById(id);
		
	}

	@Override
	public List<Location> getAllLocation() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
	}

}
