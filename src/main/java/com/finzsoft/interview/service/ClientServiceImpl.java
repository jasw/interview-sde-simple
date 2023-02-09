package com.finzsoft.interview.service;

import com.finzsoft.interview.model.Address;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClientServiceImpl implements ClientService{

    @Override
    public Map<String, List<Address>> getClientAddressesMap() {
        return new HashMap<>();
    }
}
