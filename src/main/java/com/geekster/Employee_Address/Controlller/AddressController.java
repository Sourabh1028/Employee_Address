package com.geekster.Employee_Address.Controlller;

import com.geekster.Employee_Address.Model.Address;
import com.geekster.Employee_Address.Service.AddressService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping(value = "")
    public String addAddress(@RequestBody List<Address> address){
        return addressService.addAddress(address);
    }

    @GetMapping(value = "")
    public List<Address> getAddress (@Nullable @RequestParam Long addressId){
        return addressService.getAddress(addressId);
    }

    @DeleteMapping(value = "/{addressId}")
    public String deleteAddress (@PathVariable Long addressId){
        return addressService.deleteAddress(addressId);
    }

    @PutMapping(value = "/{addressId}")
    public String updateAddress (@PathVariable Long addressId , @RequestBody Address address){
        return addressService.updateAddress(addressId , address);
    }
}
