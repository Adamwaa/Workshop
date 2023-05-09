package thymeleaf.Workshop;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.*;


import jakarta.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.Test;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import thymeleaf.Workshop.controller.RegistrationController;
import thymeleaf.Workshop.model.Registration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class RegistrationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAddRegistration() {

        HttpServletRequest request = mock(HttpServletRequest.class);
        RegistrationController controller = new RegistrationController();
        Registration registration = new Registration();
        registration.setPersonName("John Doe");

        String result = controller.addRegistration(registration, request);

        assertEquals("registration", result);
        assertEquals("John Doe", registration.getPersonName());
    }


    @Test
    public void testGreeting() throws Exception {
        this.mockMvc.perform(get("/greeting"))
                .andExpect(status().isOk());
    }
}
