/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author lucaspauloop
 */
public interface CovidControl extends Remote {
    public int cadastro(String nome, String cpf, int idade,
                        String sexo, String vacina, int dose,
                        String lote, String data)
            throws RemoteException;
    public String busca(String cpf)
            throws RemoteException;
    public long total(String a)
            throws RemoteException;
}