package oo;

public class Neto extends Filha {

    public Neto(){
        super();
    }

    public Neto (String cpf, String cnpj,
               String data_nescimento,
               String nome,
               String sobrenome){
        super.setCpf(cpf);
        super.setCnpj(cnpj);
        super.setData_nascimento(data_nescimento);
        super.setNome(nome);
        super.setSobrenome(sobrenome);
    }

    int[] lista = new int[10];

    public int cont_0_9(int a){
        return super.cont_0_9(a);
    }

}