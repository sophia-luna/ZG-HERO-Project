package mypackage

class ListaCandidatos {

    LinkedList<Candidato> candidatos

    ListaCandidatos(){
        candidatos=new LinkedList<Candidato>()
    }

    void cadastrarCandidato(Candidato candidato){
        candidatos.add(candidato)
    }

    void limparLista(){
        candidatos.clear()
    }

    boolean isEmpty(){
        return candidatos.isEmpty()
    }

    LinkedList<Candidato> listar(){
        LinkedList<Empresa> copia=candidatos
        return copia
    }

    int size(){
        return candidatos.size()
    }
}
