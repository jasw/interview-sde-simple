package com.finzsoft.interview.service;

import com.finzsoft.interview.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AddressServiceImpl implements AddressService{


    private ClientService clientService;

    public AddressServiceImpl(ClientService clientService) {
        this.clientService = clientService;
    }

    @Override
    public List<String> getClientsByAddress(Address address) {
        ArrayList<String> clients = new ArrayList<>();
        return clients;
    }
}
