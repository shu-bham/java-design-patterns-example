package com.patterns.behavioral.Mediator;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorEverydayDemo {
  private Toolkit toolkit;
  private Timer timer;

  public MediatorEverydayDemo(int seconds) {
    toolkit = Toolkit.getDefaultToolkit();
    timer = new Timer();
    timer.schedule(new RemindTask(), seconds * 1000);
    timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
  }

  public static void main(String[] args) {
    System.out.println("About to schedule a task.");
    new MediatorEverydayDemo(3);
    System.out.println("Task SCheduled");
  }

  class RemindTask extends TimerTask {

    @Override
    public void run() {
      System.out.println("TIme's Up!");
      toolkit.beep();
    }
  }

  class RemindTaskWithoutBeep extends TimerTask {

    @Override
    public void run() {
      System.out.println("Now Time's Really Up!");
      timer.cancel();
    }
  }
}
