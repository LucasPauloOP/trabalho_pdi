/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.Naming;
import java.util.Scanner;
/**
 *
 * @author lucaspauloop
 */
public class CovidControlClient {
    public static void main(String[] args) {
        try {
             int op = 0;
             String nome, cpf, sexo, vacina, lote, data;
             int idade, dose, response;
            
           Scanner cliente = new Scanner(System.in);
           CovidControl c = (CovidControl) Naming.lookup("rmi://localhost:1099/CovidControl"); 
           do {
                System.out.println("1 - cadastro");
                System.out.println("2 - Busca por CPF");
                System.out.println("3 - total por dia");
                System.out.println("4 - Sair");
                op = cliente.nextInt();
                            
                if (op == 1) {
                    try {
                        System.out.println("\nCadastre de vacinação");
                        System.out.println("\nInforme o nome: ");
                        nome = cliente.next();
                        if (cliente.hasNextLine()) cliente.nextLine();
                        System.out.println("\nInforme um cpf: ");
                        cpf = cliente.next();
                        System.out.println("\nInforme a idade do paciente: ");
                        idade = cliente.nextInt();
                        System.out.println("\nInforme o sexo: ");
                        sexo = cliente.next();
                        System.out.println("\nInforme a vacina: ");
                        vacina = cliente.next();
                        System.out.println("\nInforme a dose tomada: ");
                        dose = cliente.nextInt();
                        System.out.println("\nInforme o lote da vaicna: ");
                        lote = cliente.next();
                        System.out.println("\nInforme a data da vacina de forma que respeite o padrão dd/mm/aaaa: ");
                        data = cliente.next();
                        response = c.cadastro(nome, cpf, idade, sexo, vacina, dose, lote, data);
                   
                        if (response == 1) System.out.println("\nCadastro feito com sucesso");
                        else System.out.println("\nErro ao realizar o cadastro.");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } else if (op == 2) {
                    try {
                        System.out.println("\nInforme um cpf: ");
                        cpf = cliente.next();
                        System.out.println(c.busca(cpf));
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } else if (op == 3) {
                    try {
                        System.out.println("informe a data de aplicação: ");
                        data = cliente.next();
                        System.out.println("Total de vacinados nesta data foram: " + data + ": "+ c.total(data));
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } else if (op == 4) {
                    System.out.println("Saindo................");
                } else {
                    System.out.println("Opção inválida....");
                }
           
            } while (op != 4);
           
           cliente.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}