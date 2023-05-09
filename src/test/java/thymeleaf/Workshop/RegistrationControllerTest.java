package thymeleaf.Workshop;

import static org.mockito.Mockito.*;


import jakarta.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.Test;

import thymeleaf.Workshop.controller.RegistrationController;
import thymeleaf.Workshop.model.Registration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationControllerTest {

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


}
