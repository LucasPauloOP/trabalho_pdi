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
public class calcuatorClient {
    public static void main(String[] args) {
        try {
            Calculator c = (Calculator) Naming.lookup("rmi://localhost:1099/CalculatorService");
            System.out.println(c.add(5, 5));
            System.out.println(c.sub(5, 3));
            System.out.println(c.mul(6, 6));
            System.out.println(c.div(27, 3));
        
        }
        catch (Exception e) {
            System.out.println(e);
        }
    
    }
}
