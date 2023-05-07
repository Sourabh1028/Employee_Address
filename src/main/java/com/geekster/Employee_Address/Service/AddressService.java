package com.geekster.Employee_Address.Service;

import com.geekster.Employee_Address.Model.Address;
import com.geekster.Employee_Address.Repositary.AddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    AddressDao addressRepo;

    public String addAddress(List<Address> address) {
        List<Address> addressList = addressRepo.saveAll(address);

        if(addressList==null){
            return "Not added successfully";
        }

        return "Added successfully";
    }


    public List<Address> getAddress(Long addressId) {
        if(addressId == null){
            return addressRepo.findAll();
        }else{
            List<Address> addressList = new ArrayList<>();
            addressList.add(addressRepo.findById(addressId).get());
            return addressList;
        }
    }

    public String deleteAddress(Long addressId) {
        Optional<Address> list = addressRepo.findById(addressId);

        if(list.isEmpty()){
            return "Address with addressId "+ addressId + " not found";
        }else{
            addressRepo.deleteById(addressId);
            return "Address with addressId "+ addressId + " deleted successfully";
        }
    }

    public String updateAddress(Long addressId, Address address) {
        Optional<Address> list = addressRepo.findById(addressId);
        address.setAddressId(addressId);

        if(list.isEmpty()){
            return "Address with addressId "+ addressId + " not found";
        }else{
            addressRepo.save(address);
            return "Address with addressId "+ addressId + " updated successfully";
        }
    }
}
