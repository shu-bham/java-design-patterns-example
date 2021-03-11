package com.patterns.behavioral.Mediator;

// concrete command
public class TurnOnAllLightsCommand implements Command {

  private Mediator mediator;

  public TurnOnAllLightsCommand(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void execute() {
    mediator.turnOnAllLights();
  }
}
