package com.finzsoft.interview;

import com.finzsoft.interview.model.Address;
import com.finzsoft.interview.service.ClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class InterviewApplicationTests {

	@Autowired
	private ClientService clientService;


	@Test
	public void testSearchByAddress() {
		assertThat(clientService).isNotNull();
		assertThat(clientService.getClientAddressesMap()).isEqualTo(new HashMap<String, List<Address>>());
	}

}
