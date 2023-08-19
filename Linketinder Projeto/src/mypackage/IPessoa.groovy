package mypackage

interface IPessoa {

    String getNome()
    String getEmail()
    String getEstado()
    String getCEP()
    LinkedList<String> getCompetencias()
    void addCompetencia(String competencia)
}