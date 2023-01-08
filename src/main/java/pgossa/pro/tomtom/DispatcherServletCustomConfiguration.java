package pgossa.pro.tomtom;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletRegistrationBean;


// Configuration file used to set /api prefix 
@Configuration
public class DispatcherServletCustomConfiguration {

    @Bean
	public DispatcherServletRegistrationBean dispatcherServletRegistrationBean() {
    	return new DispatcherServletRegistrationBean(dispatcherServlet(), "/api/");
	}

    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

    @Bean
    public ServletRegistrationBean dispatcherServletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet(), "/");
        registration.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
        return registration;
    }
}