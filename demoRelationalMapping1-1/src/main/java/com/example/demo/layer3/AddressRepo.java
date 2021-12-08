package com.example.demo.layer3;

import java.util.List;

import com.example.demo.layer2.Address;

public interface AddressRepo {
	void insertAddress(Address aobj); // C

	Address selectAddress(int ano); // R

	List<Address> selectAddress(); // RA

	void updateAddress(Address aobj); // U

	void deleteAddress(int ano); // D

}
