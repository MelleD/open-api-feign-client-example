/*
 * Copyright (c) 2023 Robert Bosch Manufacturing Solutions GmbH, Germany. All rights reserved.
 */

package test;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import test.client1.api.Users1ApiClient;
import test.client2.api.Users2ApiClient;

public class StartupListener {

   @Autowired
   private Users1ApiClient users1ApiClient;

   @Autowired
   private Users2ApiClient users2ApiClient;

   @EventListener( ApplicationReadyEvent.class )
   public void test() {
      System.out.println( users1ApiClient );
      System.out.println( users2ApiClient );
      users1ApiClient.users1Post( Optional.empty() );
   }
}