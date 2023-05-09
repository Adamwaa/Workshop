package thymeleaf.Workshop;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import thymeleaf.Workshop.config.interceptors.PerformanceInterceptor;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerformanceInterceptorTest {

    @Test
    public void testPerformanceInterceptor() throws Exception {
        PerformanceInterceptor interceptor = new PerformanceInterceptor();
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setRequestURI("/registration");
        request.setMethod("GET");

        long startTime = System.currentTimeMillis();
        interceptor.preHandle(request, null, null);
        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;
        assertTrue(executionTime >= 0);
    }


}
