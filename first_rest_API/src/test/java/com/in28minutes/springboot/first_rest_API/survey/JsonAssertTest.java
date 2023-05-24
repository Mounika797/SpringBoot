package com.in28minutes.springboot.first_rest_API.survey;



import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

class JsonAssertTest {

	@Test
	void jsonAsser_LearningBasics() throws JSONException 
	{
		String expectedResponse = 
				"""
					{"id":"Question1","description":"Most Popular Cloud Platform Today","options":["AWS","Azure","Google Cloud","Oracle Cloud"],"correctAnswer":"AWS"}

						""";
		
		String actualResponse = 
				"""
					    {"id":"Question1",
					    "description":"Most Popular Cloud Platform Today","options":["AWS","Azure","Google Cloud","Oracle Cloud"],"correctAnswer":"AWS"}

						""";
		
		JSONAssert.assertEquals(expectedResponse, actualResponse, true);
	}

}
