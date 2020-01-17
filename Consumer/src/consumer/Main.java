package consumer;

import provider.Service;

import java.lang.reflect.Method;
import java.util.ServiceLoader;
//import provider.impl.ServiceImpl;

public class Main {
  public static void main(String[] args) throws Throwable {
//    Service srv = new ServiceImpl();
//    Service srv = Service.get();
    ServiceLoader<Service> loader = ServiceLoader.load(Service.class);
    for (Service srv : loader) {
//    Service srv = ???;
      System.out.println("Found a service: " + srv.getClass().getName());
      System.out.println("Message is " + srv.getMessage());
      Class<?> cl = srv.getClass();
      Method[] methods = cl.getDeclaredMethods();
      for (Method m : methods) {
        System.out.println("> " + m);
        m.setAccessible(true);
        m.invoke(srv);
      }
    }
  }
}
