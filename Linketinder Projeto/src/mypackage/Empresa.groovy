package mypackage

class Empresa extends Pessoa {

    private String cnpj
    private String pais
    private String descricaoEmpresa


    Empresa (String nome, String cnpj, String email, String pais, String estado, String cep, String descricaoEmpresa) {
        this.nome=nome
        this.email=email
        this.cnpj=cnpj
        this.pais=pais
        this.estado=estado
        this.cep=cep
        this.descricaoEmpresa=descricaoEmpresa
    }

    void setCnpj(String cnpj){
        this.cnpj=cnpj
    }

    void setPais(String pais){
        this.pais=pais
    }

    void setDescricaoEmpresa(String descricaoEmpresa){
        this.descricaoEmpresa=descricaoEmpresa
    }

    String getCnpj(){
        return cnpj
    }

    String getPais(){
        return pais
    }

    String getDescricaoEmpresa(){
        return descricaoEmpresa
    }

    @Override
    String toString() {

        String listaCompetencias=""
        for(String competencia: competencias){
            listaCompetencias+=competencia+" "
        }
        return """
        Nome: $nome
        CNPJ: $cnpj
        Email: $email
        País: $pais
        Estado: $estado
        CEP: $cep
        Descrição da Empresa: $descricaoEmpresa
        Lista de competências: 
        """ + listaCompetencias

    }
}
