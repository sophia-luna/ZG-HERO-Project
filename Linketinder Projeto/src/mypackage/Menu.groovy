package mypackage

import groovy.test.GroovyTestCase

class Menu extends GroovyTestCase{

    static void displayMenu() {

        println("    Menu")
        println("1. Cadastrar novo candidato")
        println("2. Cadastrar nova empresa")
        println("3. Listar todos os candidatos")
        println("4. Listar todas as empresas")
        println("5. Limpar todos os candidatos")
        println("6. Limpar todas as empresas")
        println("7. Sair")

    }

    static Candidato criarCandidato(){ //opcao 1

        print("Nome do Candidato: ")
        def nome=System.in.newReader().readLine()
        print("CPF do Candidato: ")
        def cpf=System.in.newReader().readLine()

        int idade
        while (true){
            print("Idade do Candidato: ")
            def idadeStr=System.in.newReader().readLine()
            if(Validacao.idadeValida(idadeStr)){
                idade=Integer.parseInt(idadeStr)
                break
            }
            else{
                "Idade inserida inválida."
            }
        }

        print("Email do Candidato: ")
        def email=System.in.newReader().readLine()
        print("Estado: ")
        def estado=System.in.newReader().readLine()
        print("CEP: ")
        def cep=System.in.newReader().readLine()
        print("Descrição Pessoal: ")
        def descricaoPessoal=System.in.newReader().readLine()

        def candidato=new Candidato(nome, cpf, idade, email, estado, cep, descricaoPessoal)

        while(true){
            print("Deseja inserir uma competência(s/n): ")
            def input=System.in.newReader().readLine()
            input=input.toLowerCase()
            if(Validacao.respostaValida(input)) {
                if (input == "s") {
                    print("Competência: ")
                    def competencia = System.in.newReader().readLine()
                    candidato.addCompetencia(competencia)
                } else {
                    break
                }
            }
            else{
                println("Opção Inválida. Insira 's' para SIM ou 'n' para NAO")
            }
        }

        return candidato

    }

    static Empresa criarEmpresa(){ //opcao 2

        print("Nome da Empresa: ")
        def nome=System.in.newReader().readLine()
        print("CNPJ da Empresa: ")
        def cnpj=System.in.newReader().readLine()
        print("País: ")
        def pais=System.in.newReader().readLine()
        print("Email da Empresa: ")
        def email=System.in.newReader().readLine()
        print("Estado: ")
        def estado=System.in.newReader().readLine()
        print("CEP: ")
        def cep=System.in.newReader().readLine()
        print("Descrição da Empresa: ")
        def descricaoEmpresa=System.in.newReader().readLine()

        def empresa=new Empresa(nome, cnpj, email, pais, estado, cep, descricaoEmpresa)

        while(true){
            print("Deseja inserir uma competência(s/n): ")
            def input=System.in.newReader().readLine()
            input=input.toLowerCase()
            if(Validacao.respostaValida(input)) {
                if (input == "s") {
                    print("Competência desejada: ")
                    def competencia = System.in.newReader().readLine()
                    empresa.addCompetencia(competencia)
                } else {
                    break
                }
            }else{
                println("Opção Inválida. Insira 's' para SIM ou 'n' para NAO")
            }
        }

        return empresa

    }

}
