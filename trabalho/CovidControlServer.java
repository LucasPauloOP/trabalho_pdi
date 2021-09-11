/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.Naming;
/**
 *
 * @author lucaspauloop
 */
public class CovidControlServer {
   public CovidControlServer () {
       try {
        CovidControl covidControl = new CovidControlImpl();
        Naming.rebind("//localhost:1099/CovidControl", covidControl);
       } catch (Exception e) {
           System.out.println(e);
       }
   }

   public static void main(String args[]) {
    new CovidControlServer();
   }
}
