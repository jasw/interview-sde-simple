package com.finzsoft.interview.service;

import com.finzsoft.interview.model.Address;

import java.util.List;

public interface AddressService {

    /**
    Please provide a function that when pass in an address, based on the result of @{@link ClientService#getClientAddressesMap()}, return the
     matching client IDs.
     */
    List<String> getClientsByAddress(Address address);
}
