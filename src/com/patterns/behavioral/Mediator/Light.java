package com.patterns.behavioral.Mediator;

// receiver
public class Light {

  private String name;
  private Boolean isOn = false;

  public Light(String name) {
    this.name = name;
  }

  public Boolean isOn() {
    return isOn;
  }

  public void toggle() {
    if (isOn) {
      off();
      isOn = false;
    } else {
      on();
      isOn = true;
    }
  }

  public void on() {
    System.out.println("Light Switched On : " + name);
  }

  public void off() {
    System.out.println("Light Switched Off : " + name);
  }
}
