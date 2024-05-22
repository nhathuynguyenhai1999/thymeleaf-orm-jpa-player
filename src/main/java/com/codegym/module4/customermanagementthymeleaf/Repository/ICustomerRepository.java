package com.codegym.module4.customermanagementthymeleaf.Repository;

import com.codegym.module4.customermanagementthymeleaf.Model.Customer;
import com.codegym.module4.customermanagementthymeleaf.Model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer,Long> {
    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContainingOrLastNameContaining(Pageable pageable, String firstName, String lastName);

}
