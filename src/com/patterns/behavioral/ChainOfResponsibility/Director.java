package com.patterns.behavioral.ChainOfResponsibility;

public class Director extends Handler {

  @Override
  public void handleRequest(Request request) {
    if (request.getRequestType() == RequestType.CONFERENCE)
      System.out.println("Directors can approve Conferences");
    else
        successor.handleRequest(request);
  }
}
