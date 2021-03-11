package com.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
  private List<Observer> observers = new ArrayList<>();

  abstract String getState();

  abstract void setState(String state);

  public void attach(Observer observer) {
    observers.add(observer);
  }

  public void detach(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObserver() {
    for (Observer observer : observers) {
      observer.update();
    }
  }
}
