package com.gaurav.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.gaurav.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
