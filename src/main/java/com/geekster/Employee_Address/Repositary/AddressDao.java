package com.geekster.Employee_Address.Repositary;

import com.geekster.Employee_Address.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao extends JpaRepository<Address, Long> {

}
