package org.example.conroller;

import org.example.dto.Customer;
import org.example.dto.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerContoller {
    @GetMapping("/getCustomer")
    public Customer getCustomer(){
        Customer customer=new Customer();
        customer.setFirstName("wasala");
        customer.setLastName("karunarathna");

        return customer;
    }
}
