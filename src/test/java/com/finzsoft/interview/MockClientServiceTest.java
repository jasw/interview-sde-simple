package com.finzsoft.interview;


import com.finzsoft.interview.model.Address;
import com.finzsoft.interview.service.ClientService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class MockClientServiceTest {

    ClientService mockClientService = mock(ClientService.class);

    @Test
    void testMock(){

        HashMap<String, List<Address>> result = new HashMap<>();
        result.put("1", Arrays.asList(new Address("1 Great South Rd"), new Address("2 Great North Rd")));

        given(mockClientService.getClientAddressesMap()).willReturn(result);

        assertThat(mockClientService.getClientAddressesMap()).isEqualTo(result);

    }

}
