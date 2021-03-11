package com.patterns.behavioral.visitorBad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

  private List<AtvPart> parts = new ArrayList<>();

  public PartsOrder() {}

  public void addPart(AtvPart part) {
    parts.add(part);
  }

  public List<AtvPart> getParts() {
    return Collections.unmodifiableList(parts);
  }

  public double calculateShipping() {
    double cost = 0;
    for (AtvPart part : parts) {
      cost += part.calculateShipping();
    }
    return cost;
  }
}
