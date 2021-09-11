public class Pessoa {
    private String cpf, nome, sexo, vacina, lote, data;
    private int idade, dose;

    public Pessoa(String cpf, String nome, String sexo, String vacina,
                  String lote, String data, int idade, int dose) {
        this.setCpf(cpf);
        this.setNome(nome);
        this.setSexo(sexo);
        this.setVacina(vacina);
        this.setLote(lote);
        this.setData(data);
        this.setIdade(idade);
        this.setDose(dose);
    }

    public Pessoa() {
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public String getData() {
        return this.data;
    }
    
    public String getLote() {
        return this.lote;
    }
    
    public String getVacina() {
        return this.vacina;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDose() {
        return this.dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }
}