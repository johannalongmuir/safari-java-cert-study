package provider.impl;

import provider.Service;

public class ServiceImpl implements Service {
  @Override
  public String getMessage() {
    return "Hello from a service!";
  }
  private void secretBehavior() {
    System.out.println("Yikes, this should be secret!");
  }
}
