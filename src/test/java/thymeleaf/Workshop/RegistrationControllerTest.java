package thymeleaf.Workshop;

import static org.mockito.Mockito.*;


import jakarta.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import thymeleaf.Workshop.controller.RegistrationController;
import thymeleaf.Workshop.model.Registration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
public class RegistrationControllerTest {

    private RegistrationController registrationController;

    @Mock
    private BindingResult result;

    @Mock
    private HttpServletRequest httpServletRequest;

    @Mock
    private Model mockModel;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        registrationController = new RegistrationController();
    }

    @Test
    public void testGetRegistration() {
        Registration registration = new Registration();
        String viewName = registrationController.getRegistration(registration);
        assertEquals("registration", viewName);
    }

    @Test
    public void testAddRegistration() {
        Registration registration = new Registration();
        registration.setPersonName("Adam");

        when(result.hasErrors()).thenReturn(false);

        String viewName = registrationController.addRegistration(registration,
                result);

        assertEquals("registration", viewName);
         verify(result, times(1)).hasErrors();
        verifyNoInteractions(mockModel);
        assertEquals("Adam", registration.getPersonName());
    }

    @Test
    public void testAddRegistration_ValidRegistration_HasNoErrors() {
        Registration registration = new Registration();
       registration.setPersonName("Adam");

        when(result.hasErrors()).thenReturn(false);

        String viewName = registrationController.addRegistration(registration, result);
        verify(result, times(1)).hasErrors();
        verifyNoInteractions(mockModel);
    }
}
