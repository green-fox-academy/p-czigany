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

//  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
//          MediaType.APPLICATION_JSON.getSubtype(),
//          Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testSuccessful() throws Exception {
    mockMvc.perform(get("/groot")
            .param("message", "some message"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.received", is("some message")))
            .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }
}
