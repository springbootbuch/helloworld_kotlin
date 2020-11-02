package de.springbootbuch.helloworld

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@ExtendWith(SpringExtension::class)
@WebMvcTest
class ApplicationTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test fun helloWorldShouldWork() {
        mockMvc
            .perform(get("/hello").param("name", "World"))
            .andExpect(status().isOk)
            .andExpect(content().string("Hello, World\n"))
    }
}