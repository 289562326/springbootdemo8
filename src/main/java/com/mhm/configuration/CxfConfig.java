package com.mhm.configuration;

import com.mhm.webservice.cxf.SCService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;
/**
 * Created by MHm on 2018/11/20.
 */
@Configuration
public class CxfConfig {
//    @Bean
//    public ServletRegistrationBean dispatcherServlet(){
//        return new ServletRegistrationBean(new CXFServlet(),"/demo/*");
//    }

    @Autowired
    private Bus bus;

    @Autowired
    SCService scService;

    /** JAX-WS **/
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, scService);
        endpoint.publish("/SCService");
        return endpoint;
    }
}
