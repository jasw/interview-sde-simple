package com.finzsoft.interview.service;

import com.finzsoft.interview.model.Address;

import java.util.List;
import java.util.Map;

public interface ClientService {

    /**
     * Find and return all clients with associated addresses.
     *
     * A client can have multiple addresses and vice versa.
     *
     * @return a Map with client ID as the key and list of addresses as the value.
     */
    Map<String, List<Address>> getClientAddressesMap();
}
