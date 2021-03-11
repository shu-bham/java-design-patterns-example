package com.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

// client
public class CommandDemo {

  public static void main(String[] args) {
      Light bedroomLight = new Light();
      Light kitchenLight = new Light();
      Switch lightswitch = new Switch();

      Command toggleCommand = new ToggleCommand(bedroomLight);

      lightswitch.storeAndExecute(toggleCommand);
//      lightswitch.storeAndExecute(toggleCommand);
//      lightswitch.storeAndExecute(toggleCommand);

      List<Light> lights = new ArrayList<>();
      lights.add(kitchenLight);
      lights.add(bedroomLight);

      Command allLights = new AllLights(lights);
      lightswitch.storeAndExecute(allLights);
//      lightswitch.storeAndExecute(allLights);
//      lightswitch.storeAndExecute(allLights);
  }
}
