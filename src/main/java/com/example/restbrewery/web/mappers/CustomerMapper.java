package com.example.restbrewery.web.mappers;

import com.example.restbrewery.domain.Customer;
import com.example.restbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
