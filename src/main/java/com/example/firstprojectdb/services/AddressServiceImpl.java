package com.example.firstprojectdb.services;

import com.example.firstprojectdb.model.Address;
import com.example.firstprojectdb.model.City;
import com.example.firstprojectdb.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

@Component("addressService")
@Transactional
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepo addressRepo;

    @Override
    public void createNewAddress() {
        Address address = addressRepo.findById(6L).orElseThrow(IllegalStateException::new);
        City city = new City();
        city.setCity("Vilnius");
        city.setCountryId(60L);
        city.setLastUpdate(LocalDateTime.now());
        address.getCities().add(city);
        addressRepo.save(address);
        System.out.println(address);
    }
}
