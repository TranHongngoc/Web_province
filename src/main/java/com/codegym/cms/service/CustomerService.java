package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByLastNameContaining(String lastname, Pageable pageable);

    Iterable<Customer> findAllByProvince(Province province);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}