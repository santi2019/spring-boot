package sample.actuator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldServiceTest {

	/*
	@Test
	public void HelloMessageTest() { 
		HelloWorldService helloWorldService = new HelloWorldService();
		assertEquals("Expected correct message","Hola Hola",helloWorldService.getHelloMessage());
		assertEquals("Expected correct message","Hello Hello",helloWorldService.getHelloMessage());
	}*/
	

	@Test
	public void expectedMessage() {
		HelloWorldService helloWorldService = new HelloWorldService();
		assertEquals("Expected correct message","Spring boot says hello from a Docker container",helloWorldService.getHelloMessage());
	}
	
}
