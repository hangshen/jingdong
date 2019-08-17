package org.lanqiao.service;

import org.lanqiao.entity.Address;
import org.lanqiao.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressMapper addressMapper;

    @Override
    public List<Address> getAddress(int userId){
        return addressMapper.selectByPrimaryKey(userId);
    }

}
