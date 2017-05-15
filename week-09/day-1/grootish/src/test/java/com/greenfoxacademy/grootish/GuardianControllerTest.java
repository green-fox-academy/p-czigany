package com.greenfoxacademy.grootish;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * Created by peter on 2017.05.15..
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GrootishApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testGrootSuccessful() throws Exception {
    mockMvc.perform(get("/groot")
            .param("message", "some message"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.received", is("some message")))
            .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void testGrootError() throws Exception {
    mockMvc.perform(get("/groot"))
            .andExpect(status().isBadRequest())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void testYonduSuccessful() throws Exception {
    mockMvc.perform(get("/yondu")
            .param("distance", "100.0")
            .param("time", "10.0"))
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.distance", is(100.0)))
            .andExpect(jsonPath("$.time", is(10.0)))
            .andExpect(jsonPath("$.speed", is(10.0)));
  }

  @Test
  public void testYonduError() throws Exception {
    mockMvc.perform(get("/groot"))
            .andExpect(status().isBadRequest())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.error", is("I am Groot!")));
  }
}
