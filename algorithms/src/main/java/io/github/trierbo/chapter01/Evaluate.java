package io.github.trierbo.chapter01;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            switch (s) {
                case "+":
                    ops.push(s);
                    break;
                case "-":
                    ops.push(s);
                    break;
                case "*":
                    ops.push(s);
                    break;
                case "/":
                    ops.push(s);
                    break;
                case "sqrt":
                    ops.push(s);
                    break;
                case "(":
                    break;
                case ")":
                    String op = ops.pop();
                    double val = vals.pop();
                    switch (op) {
                        case "+":
                            val += vals.pop();
                            break;
                        case "-":
                            val -= vals.pop();
                            break;
                        case "*":
                            val *= vals.pop();
                            break;
                        case "/":
                            val /= vals.pop();
                            break;
                        case "sqrt":
                            val = Math.sqrt(val);
                            break;
                    }
                    vals.push(val);
                    break;
                default:
                    vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }
}
