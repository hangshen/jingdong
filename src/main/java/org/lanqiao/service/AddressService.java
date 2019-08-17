package org.lanqiao.service;

import org.lanqiao.entity.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressService {
    public List<Address> getAddress(int userId);

    public int createAddress(Address address);
}
