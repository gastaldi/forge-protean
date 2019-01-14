package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.forge.furnace.Furnace;

@ApplicationScoped
public class GreetingService
{
   @Inject
   private Furnace furnace;

   public String greeting(String name)
   {
      System.out.println(Furnace.instance(getClass().getClassLoader()));
      return "hello " + name + " ";
   }

}