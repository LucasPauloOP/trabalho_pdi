/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rml;
import java.rmi.Naming;
/**
 *
 * @author lucaspauloop
 */
public class CalculatorServer {
   public CalculatorServer() {
       try {
           Calculator c = new CalculatorImpl();
           Naming.rebind("//localhost:1099/CalculatorService", c);
       } catch (Exception e) {
           System.out.println("Trouble: " + e);
       }
   }
   
   public static void main(String args[]) {
       new CalculatorServer();
   }
}   
