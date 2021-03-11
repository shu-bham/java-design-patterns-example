package com.patterns.behavioral.state;

import static java.lang.System.out;

public class StateDemo {
  public static void main(String[] args) {
    Fan fan = new Fan();
    out.println(fan);

    fan.pullChain();
    out.println(fan);

    fan.pullChain();
    out.println(fan);

    fan.pullChain();
    out.println(fan);

    fan.pullChain();
    out.println(fan);
  }
}
