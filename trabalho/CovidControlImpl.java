import java.util.ArrayList;
import java.rmi.RemoteException;

public class CovidControlImpl extends java.rmi.server.UnicastRemoteObject implements CovidControl {
    private Pessoa pessoa;
    
    ArrayList<Pessoa> dados = new ArrayList<>();
   
   public CovidControlImpl() throws java.rmi.RemoteException {
       super();
   }

   @Override
   public int cadastro(String nome, String cpf, int idade, String sexo, String vacina, int dose, String lote,
           String data) throws RemoteException {
       try {
           Pessoa pessoa = new Pessoa(cpf, nome, sexo, vacina, lote, data, dose, idade);
           dados.add(pessoa);
           return 1;
       } catch (Exception e) {
           return 0;
       }
   }

   @Override
   public String busca(String cpf) throws RemoteException {
       try {
           if (dados.isEmpty()) {
                return "Lista vazia";
           }
        
           for (int i = 0; i < dados.size(); i++) {
               Pessoa pessoa = dados.get(i);
               String cpfPessoa = pessoa.getCpf();
               if (cpfPessoa.compareTo(cpf) == 0) {
                   return "Vacina: " + pessoa.getVacina() + " Dose: "+ pessoa.getDose() + " Lote: " + pessoa.getLote();
               }
           }
           
           return "CPF não localizado.";
       } catch(Exception e) {
           return "Erro na lista";
       }
   }

   @Override
   public long total(String data) throws RemoteException {
       int count = 0;
       for (int i = 0; i < dados.size(); i++) {
           Pessoa pessoa = dados.get(i);
           String dataPessoa = pessoa.getData();
           if (dataPessoa.compareTo(data) == 0) {
               count++;
           }
       }
       return count;
   }
}