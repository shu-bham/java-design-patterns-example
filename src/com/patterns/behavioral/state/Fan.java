package com.patterns.behavioral.state;

public class Fan {

  State fanOffState;
  State fanMedState;
  State fanLowState;
  State fanHighState;
  State state;

  public Fan() {
    fanOffState = new FanOffState(this);
    fanLowState = new FanLowState(this);
    fanMedState = new FanMedState(this);
    fanHighState = new FanHighState(this);
    state = fanOffState;
  }

  public void pullChain() {
    state.handleRequest();
  }

  @Override
  public String toString() {
    return state.toString();
  }

  public State getFanLowState() {
    return fanLowState;
  }

  public State getFanMedState() {
    return fanMedState;
  }

  public State getFanOffState() {
    return fanOffState;
  }

  public State getFanHighState(){
    return fanHighState;
  }

  public void setState(State state) {
    this.state = state;
  }
}
