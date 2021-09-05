/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rml;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author lucaspauloop
 */
public interface Calculator extends Remote {
    public long add(long a, long b)
            throws RemoteException;
    public long sub(long a, long b)
            throws RemoteException;
    public long mul(long a, long b)
            throws RemoteException;
    public long div(long a, long b)
            throws RemoteException;
}