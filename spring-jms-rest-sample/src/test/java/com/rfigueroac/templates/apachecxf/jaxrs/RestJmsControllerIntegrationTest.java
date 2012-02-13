package com.rfigueroac.templates.apachecxf.jaxrs;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@ContextConfiguration("/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class RestJmsControllerIntegrationTest {

	private String URL = "http://localhost:8080/spring-jms-rest-sample/rest/jms";

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void testRestJmsPost() {
		ResponseEntity<String> response = restTemplate.postForEntity(URL,
				"Ricardo Figueroa", String.class);
		Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
		Assert.assertEquals("Mensaje enviado", response.getBody());
	}
}