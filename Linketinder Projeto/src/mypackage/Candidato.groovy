package mypackage

class Candidato extends Pessoa{

    String cpf
    int idade
    String descricaoPessoal

    Candidato (String nome, String cpf, int idade, String email, String estado, String cep, String descricaoPessoal) {
        this.nome=nome
        this.cpf=cpf
        this.idade=idade
        this.email=email
        this.estado=estado
        this.cep=cep
        this.descricaoPessoal=descricaoPessoal
    }

    void setCpf(String cpf){
        this.cpf=cpf
    }

    void setIdade(int idade){
        this.idade=idade
    }

    void setDescricaoPessoal(String descricaoPessoal){
        this.descricaoPessoal=descricaoPessoal
    }

    String getCpf(){
        return cpf
    }

    int getIdade(){
        return idade
    }

    String getDescricaoPessoal(){
        return descricaoPessoal
    }

    @Override
    String toString() {
        String listaCompetencias=""
        for(String competencia: competencias){
            listaCompetencias+=competencia+" "
        }
        return """
        Nome: $nome
        CPF: $cpf
        Idade: $idade
        Email: $email
        Estado: $estado
        CEP: $cep
        Descrição Pessoal: $descricaoPessoal
        Lista de competências:
        """ + listaCompetencias
    }

}
