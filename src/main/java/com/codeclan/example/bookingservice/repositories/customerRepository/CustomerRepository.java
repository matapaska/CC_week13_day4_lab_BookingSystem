package com.codeclan.example.bookingservice.repositories.customerRepository;

import com.codeclan.example.bookingservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {


    List<Customer> findCustomersByBookingsCourseId(Long id);


}
