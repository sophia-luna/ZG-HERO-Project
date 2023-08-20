package mypackage

class ListaEmpresas {

    LinkedList<Empresa> empresas

    ListaEmpresas(){
        empresas=new LinkedList<Empresa>()
    }

    void cadastrarEmpresa(Empresa empresa){
        empresas.add(empresa)
    }

    void limparLista(){
        empresas.clear()
    }

    boolean isEmpty(){
        return empresas.isEmpty()
    }

    LinkedList<Empresa> listar(){
        LinkedList<Empresa> copia=empresas
        return copia
    }

    int size(){
        return empresas.size()
    }
}
