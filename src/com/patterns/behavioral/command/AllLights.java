package com.patterns.behavioral.command;

import java.util.List;

public class AllLights implements Command {

  private List<Light> lights;

  public AllLights(List<Light> lights) {
    this.lights = lights;
  }

  @Override
  public void execute() {
    for (Light light : lights) {
      if (light.isOn()) light.toggle();
    }
  }
}
