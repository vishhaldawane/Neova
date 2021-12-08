package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Address;
import com.example.demo.layer2.Person;
@Repository
public class AddressRepoImpl extends BaseRepository implements AddressRepo {

	@Transactional
	public void insertAddress(Address aobj) {
		super.persist(aobj); 

	}

	@Override
	public Address selectAddress(int ano) {
		Address address = super.find(Address.class, ano);
		return address;
	}

	@Override
	public List<Address> selectAddress() {
		List<Address>  addressList = new ArrayList<Address>();
		return super.findAll("Address");
	}

	@Transactional
	public void updateAddress(Address aobj) {
		super.merge(aobj);

	}

	@Transactional
	public void deleteAddress(int ano) {
		super.remove(Person.class, ano);
	}

}
