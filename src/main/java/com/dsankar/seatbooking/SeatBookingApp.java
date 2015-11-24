package com.dsankar.seatbooking;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.eclipse.jetty.servlets.CrossOriginFilter;
import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration.Dynamic;

import java.util.EnumSet;

public class SeatBookingApp extends Application<SeatBookingConf> {
    public static void main(String[] args) throws Exception {
        new SeatBookingApp().run(args);
    }

    @Override
    public void initialize(Bootstrap<SeatBookingConf> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(SeatBookingConf configuration,
                    Environment environment) {
                    
//        this.configureCors(environment); 
        
        final SeatBookingResource seatBookingResource = new SeatBookingResource(
        	configuration.getTemplate(),
        	configuration.getDefaultName()
    	);
    	
    	environment.jersey().register(seatBookingResource);
    }
    
/*    //Enable CORS
    private void configureCors(Environment environment) {
    	Dynamic filter = environment.servlets().addFilter("CORS", CrossOriginFilter.class);
	    filter.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");
    	filter.setInitParameter(CrossOriginFilter.ALLOWED_METHODS_PARAM, "GET,PUT,POST,DELETE,OPTIONS");
	    filter.setInitParameter(CrossOriginFilter.ALLOWED_ORIGINS_PARAM, "*");
    	filter.setInitParameter(CrossOriginFilter.ACCESS_CONTROL_ALLOW_ORIGIN_HEADER, "*");
	    filter.setInitParameter("allowedHeaders", "Content-Type,Authorization,X-Requested-With,Content-Length,Accept,Origin");
    	filter.setInitParameter("allowCredentials", "true");
  }*/

}