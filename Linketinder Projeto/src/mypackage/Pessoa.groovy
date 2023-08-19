package mypackage

class Pessoa implements IPessoa {

    String nome
    String email
    String estado
    String cep
    LinkedList<String> competencia=new LinkedList<String>()

    Pessoa() {}

    void setNome(String nome) {
        this.nome = nome
    }

    void setEmail(String email){
        this.email=email
    }

    void setEstado(String estado){
        this.estado=estado
    }

    @Override
    void addCompetencia(String competencia){
        this.competencia.push(competencia)
    }

    @Override
    String getNome() {
        return nome
    }

    @Override
    String getEmail() {
        return email
    }

    @Override
    String getEstado() {
        return estado
    }

    @Override
    String getCEP() {
        return cep
    }

    @Override
    LinkedList<String> getCompetencias() {
        LinkedList<String> copiaCompetencia= competencia.clone() as LinkedList<String>
        return copiaCompetencia
    }
}
