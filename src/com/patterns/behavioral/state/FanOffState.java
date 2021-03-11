package com.patterns.behavioral.state;

public class FanOffState extends State {
  private Fan fan;
  public FanOffState(Fan fan) {
    this.fan = fan;
  }

  @Override
  public void handleRequest() {
    System.out.println("Turning Fan onto Low");
    fan.setState(fan.getFanLowState());
  }

  @Override
  public String toString() {
    return "Fan is Off";
  }
}
