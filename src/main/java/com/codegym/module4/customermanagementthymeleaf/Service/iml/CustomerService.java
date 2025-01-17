package com.codegym.module4.customermanagementthymeleaf.Service.iml;

import com.codegym.module4.customermanagementthymeleaf.Model.Customer;
import com.codegym.module4.customermanagementthymeleaf.Model.Province;
import com.codegym.module4.customermanagementthymeleaf.Repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return iCustomerRepository.findAllByProvince(province);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(Pageable pageable, String name) {
        return iCustomerRepository.findAllByFirstNameContainingOrLastNameContaining(pageable, name, name);
    }
}
