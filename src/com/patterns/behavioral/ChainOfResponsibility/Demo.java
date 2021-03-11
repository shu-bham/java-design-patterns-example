package com.patterns.behavioral.ChainOfResponsibility;


public class Demo {

  public static void main(String[] args) {
    //
      Director cs = new Director();
      VP shubh = new VP();
      CEO raj = new CEO();

      cs.setSuccessor(shubh);
      shubh.setSuccessor(raj);

      Request request = new Request(RequestType.CONFERENCE, 500);
      cs.handleRequest(request);

      request = new Request(RequestType.PURCHASE, 1000);
      shubh.handleRequest(request);

      request = new Request(RequestType.PURCHASE, 2000);
      cs.handleRequest(request);



  }
}
