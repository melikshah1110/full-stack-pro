package com.hasnol.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomerById(Integer id);
    void insertCustomer(Customer customer);
    boolean existPersonWithEmail(String email);
    boolean existPersonWithId(Integer customerId);

    void deleteCustomerById(Integer customerId);

    void updateCustomer(Customer customer);
}
