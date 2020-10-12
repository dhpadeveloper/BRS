package com.padh.repository;

import org.springframework.data.repository.CrudRepository;

import com.padh.model.Trip;

public interface TripRepository extends CrudRepository<Trip, Long> {

}
