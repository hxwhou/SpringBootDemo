package com.ibm.cruise.controller;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.cruise.SpringBootSampleApplication;
import com.ibm.cruise.entity.Score;
import com.ibm.cruise.entity.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootSampleApplication.class)
@WebAppConfiguration
public class StudentControllerTest {
	private MockMvc mockMvc;

	private ObjectMapper objectMapper;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		objectMapper = new ObjectMapper();
	}

	@Test
	public void testGetStudentList() throws Exception {
		MockHttpServletRequestBuilder get = MockMvcRequestBuilders.get("/rest/student/list");
		MockHttpServletResponse response = mockMvc.perform(get.characterEncoding("UTF-8").contentType(MediaType.APPLICATION_JSON)).andReturn().getResponse();
		int status = response.getStatus();
		String responseBody = response.getContentAsString();
		TypeReference<List<Student>> ref = new TypeReference<List<Student>>() { };
		List<Score> returnObject = objectMapper.readValue(responseBody, ref);
		assertEquals(200, status);
		assertEquals(6, returnObject.size());
	}

}
