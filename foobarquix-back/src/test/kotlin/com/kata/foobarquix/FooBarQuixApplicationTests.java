package com.kata.foobarquix;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kata.foobarquix.services.FooBarQuixService;

@SpringBootTest
public class FooBarQuixApplicationTests {

	@Autowired
	FooBarQuixService service;
	
	@Test
	void shouldReturn1() {
		String result = service.convertNumber(1).getResult();
		assertThat(result).isEqualTo("1");
	}
	
	@Test
	void shouldReturnFooFoo() {
		String result = service.convertNumber(3).getResult();
		assertThat(result).isEqualTo("FooFoo");
	}
	
	@Test
	void shouldReturnBarBar() {
		String result = service.convertNumber(5).getResult();
		assertThat(result).isEqualTo("BarBar");
	}
	
	@Test
	void shouldReturnQuix() {
		String result = service.convertNumber(7).getResult();
		assertThat(result).isEqualTo("Quix");
	}
	
	@Test
	void shouldReturnFoo() {
		String result = service.convertNumber(9).getResult();
		assertThat(result).isEqualTo("Foo");
	}
	
	@Test
	void shouldReturnFooBar() {
		String result = service.convertNumber(51).getResult();
		assertThat(result).isEqualTo("FooBar");
	}
	
	@Test
	void shouldReturnBarFoo() {
		String result = service.convertNumber(53).getResult();
		assertThat(result).isEqualTo("BarFoo");
	}
	
	@Test
	void shouldReturnBarBarBar() {
		String result = service.convertNumber(55).getResult();
		assertThat(result).isEqualTo("BarBarBar");
	}
	
	@Test
	void shouldReturnFooQuix() {
		String result = service.convertNumber(27).getResult();
		assertThat(result).isEqualTo("FooQuix");
	}
	
	@Test
	void shouldReturnFooBarBar() {
		String result = service.convertNumber(15).getResult();
		assertThat(result).isEqualTo("FooBarBar");
	}
	
}
