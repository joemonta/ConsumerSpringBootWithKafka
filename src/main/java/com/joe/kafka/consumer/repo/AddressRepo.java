package com.joe.kafka.consumer.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joe.kafka.consumer.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

	Optional<Address> findBypId(Integer id);
	
	void deleteBypId(Integer id) ;
	
}
