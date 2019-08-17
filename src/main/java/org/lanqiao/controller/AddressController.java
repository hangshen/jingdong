package org.lanqiao.controller;

import org.lanqiao.entity.Address;
import org.lanqiao.entity.Express;
import org.lanqiao.mapper.AddressMapper;
import org.lanqiao.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @RequestMapping("/Address/getAddress")
    public List<Address> getAddress(int userId){
        return addressService.getAddress(userId);
    }

    @RequestMapping("/Address/createAddress")
    public int createAddress(@RequestBody  Address address){
        return addressService.createAddress(address);
    }
}
