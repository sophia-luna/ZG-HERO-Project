package mypackage

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ListaCandidatosTeste {

    ListaCandidatos candidatos

    @BeforeEach
    void setUp() {
        candidatos = new ListaCandidatos()
        Candidato c1 = new Candidato("Maria Silva", "23.456.789-01", 27, "maria.silva@email.com", "Amazonas", "01234-567", "Sou uma profissional dedicada e apaixonada por tecnologia. Tenho experiência em desenvolvimento web e estou sempre em busca de desafios que me permitam expandir minhas habilidades. Adoro trabalhar em equipe e estou sempre aberta a aprender coisas novas.")
        Candidato c2 = new Candidato("Gabriel Santos", "987.654.321-02", 32, "gabriel.santos@email.com", "Rio de Janeiro", "04567-890", "Sou um líder nato com vasta experiência em gestão de projetos. Minha paixão por resolver problemas e otimizar processos me impulsiona a entregar resultados de qualidade. Tenho habilidades de comunicação excepcionais e uma abordagem colaborativa para liderar equipes em direção ao sucesso.")
        candidatos.cadastrarCandidato(c1)
        candidatos.cadastrarCandidato(c2)
    }

    @Test
    void cadastarCandidatoTeste() {
        Candidato c3 = new Candidato("Ana Oliveira", "234.567.890-03", 22, "ana.oliveira@email.com", "Minas Gerais", "07890-123", "Sou uma recém-formada em design gráfico apaixonada por arte e criatividade. Minha abordagem inovadora para resolver problemas e minha capacidade de pensar fora da caixa me permitem criar designs impactantes. Estou animada para contribuir com minha energia e ideias frescas.")
        candidatos.cadastrarCandidato(c3)
        assert candidatos.size() == 3
    }

    @Test
    void ListarTeste() {
        Candidato c4 = new Candidato("Rafael Costa", "345.678.901-04", 40, "rafael.costa@email.com", "Santa Catarina", "56789-012", "Sou um profissional experiente na área de marketing, com uma forte compreensão das tendências do mercado. Minha habilidade em analisar dados e identificar oportunidades me permite desenvolver estratégias eficazes. Sou apaixonado por construir marcas e alcançar resultados mensuráveis.")
        candidatos.cadastrarCandidato(c4)
        LinkedList<Candidato> copia = candidatos.listar()
        assert candidatos.size() == 3
        assert copia[2] == c4
    }

    @Test
    void limparListaTeste() {
        candidatos.limparLista()
        assert candidatos.size() == 0
    }
}
