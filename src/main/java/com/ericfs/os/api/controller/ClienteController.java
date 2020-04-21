package com.ericfs.os.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericfs.os.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João das Couves");
		cliente1.setTelefone("34 99999 1111");
		cliente1.setEmail("joaodascouves@ola.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("34 99999 2222");
		cliente2.setEmail("mariadascouves@ola.com");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
