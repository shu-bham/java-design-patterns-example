package com.patterns.behavioral.Interpreter;

public class InterpreterDemo {

  static Expression buildInterpreterTree() {
    Expression terminal1 = new TerminalExpression("Lions");
    Expression terminal2 = new TerminalExpression("Tigers");
    Expression terminal3 = new TerminalExpression("Bears");

    // Tigers and Bears
    Expression alternate1 = new AndExpression(terminal2, terminal3);

    // Lions or (Tigers and Bears)
    Expression alternate2 = new OrExpression(terminal2, alternate1);

    // Bears and ( Lions or (Tigers and Bears) )
    return new AndExpression(terminal3, alternate2);
  }

  /**
   * main method - build the interpreter and then interpret a specific sequence
   *
   * @param args
   */
  public static void main(String[] args) {
      String context = "Lions";
      String context1 = "Tigers";
      String context2 = "Bears";
      String context3= "Lions Tigers";
      String context4 = "Lions Bears";
      String context5 = "Tigers Bears";

    Expression define = buildInterpreterTree();
      System.out.println(context + " is " + define.interpret(context));
      System.out.println(context1 + " is " + define.interpret(context1));
      System.out.println(context2 + " is " + define.interpret(context2));
      System.out.println(context3 + " is " + define.interpret(context3));
      System.out.println(context4 + " is " + define.interpret(context4));
      System.out.println(context5 + " is " + define.interpret(context5));
  }
}
