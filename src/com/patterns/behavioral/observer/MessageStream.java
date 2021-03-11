package com.patterns.behavioral.observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {

  private Deque<String> messageHistory = new ArrayDeque<>();

  @Override
  String getState() {
      return messageHistory.getLast();
  }

  @Override
  void setState(String message) {
      messageHistory.add(message);
      this.notifyObserver();
  }
}
