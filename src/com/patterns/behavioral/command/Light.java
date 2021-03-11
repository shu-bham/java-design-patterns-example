package com.patterns.behavioral.command;

// receiver
public class Light {

  private Boolean isOn = false;

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
    System.out.println("Light Switched On");
  }

  public void off() {
    System.out.println("Light Switched Off");
  }
}
