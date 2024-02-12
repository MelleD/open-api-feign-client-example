/*
 * Copyright (c) 2022 Robert Bosch Manufacturing Solutions GmbH, Germany. All rights reserved.
 */

package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

   public static void main( final String[] args ) {
      SpringApplication.run( Application.class, args );
   }

   @Bean
   StartupListener startupListener() {
      return new StartupListener();
   }

}
