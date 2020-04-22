package com.joe.kafka.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joe.kafka.consumer.entity.Address;
import com.joe.kafka.consumer.repo.AddressRepo;

@Service
@Transactional
public class AddressService {

	@Autowired
	public AddressRepo addressRepo;
	
	public Address getAddress(Integer pId) {
		return addressRepo.findBypId(pId)
				.orElseThrow();
	}
	
	public Address saveAddress(Address address) {
		return addressRepo.save(address);
	}
	
	public void removeAddress(Address address) {
		addressRepo.deleteBypId(address.getpId());
	}
	
}
