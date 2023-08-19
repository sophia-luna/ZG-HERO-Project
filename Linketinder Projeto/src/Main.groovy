import mypackage.Candidato
import mypackage.Empresa
import mypackage.Menu
import mypackage.Validacao

static void main(String[] args) {

    LinkedList<Candidato> candidatos = new LinkedList<Candidato>()
    LinkedList<Empresa> empresas = new LinkedList<Empresa>()

    //O programa tem que manter um array de candidatos com no mínimo 5 candidatos pré-cadastrados:
    Candidato c1=new Candidato("Maria Silva", "23.456.789-01", 27, "maria.silva@email.com", "Amazonas", "01234-567", "Sou uma profissional dedicada e apaixonada por tecnologia. Tenho experiência em desenvolvimento web e estou sempre em busca de desafios que me permitam expandir minhas habilidades. Adoro trabalhar em equipe e estou sempre aberta a aprender coisas novas.")
    Candidato c2=new Candidato("Gabriel Santos", "987.654.321-02", 32, "gabriel.santos@email.com", "Rio de Janeiro", "04567-890", "Sou um líder nato com vasta experiência em gestão de projetos. Minha paixão por resolver problemas e otimizar processos me impulsiona a entregar resultados de qualidade. Tenho habilidades de comunicação excepcionais e uma abordagem colaborativa para liderar equipes em direção ao sucesso.")
    Candidato c3=new Candidato("Ana Oliveira", "234.567.890-03", 22, "ana.oliveira@email.com", "Minas Gerais", "07890-123", "Sou uma recém-formada em design gráfico apaixonada por arte e criatividade. Minha abordagem inovadora para resolver problemas e minha capacidade de pensar fora da caixa me permitem criar designs impactantes. Estou animada para contribuir com minha energia e ideias frescas.")
    Candidato c4=new Candidato("Rafael Costa", "345.678.901-04", 40, "rafael.costa@email.com", "Santa Catarina", "56789-012", "Sou um profissional experiente na área de marketing, com uma forte compreensão das tendências do mercado. Minha habilidade em analisar dados e identificar oportunidades me permite desenvolver estratégias eficazes. Sou apaixonado por construir marcas e alcançar resultados mensuráveis.")
    Candidato c5=new Candidato("Lúcia Mendes", "456.789.012-05", 36, "lucia.mendes@email.com", "Bahia", "12345-678", "Sou uma comunicadora entusiasmada e criativa, com experiência em redação e produção de conteúdo. Tenho um olhar atento aos detalhes e sou comprometida em entregar informações precisas e envolventes. Minha paixão por contar histórias me impulsiona a criar conteúdo que ressoa com o público.")
    c1.addCompetencia("JavaScript")
    c1.addCompetencia("CSS")
    c1.addCompetencia("HTML")
    c3.addCompetencia("Corel")
    c3.addCompetencia("CriCut")
    candidatos.add(c1)
    candidatos.add(c2)
    candidatos.add(c3)
    candidatos.add(c4)
    candidatos.add(c5)


    //Deve existir um array de empresas com no mínimo 5 empresas pré-cadastradas:
    Empresa e1=new Empresa("InovaTech Solutions", "12.345.678/0001-01", "Brasil", "contato@inovatechsolutions.com", "São Paulo", "12345-678", "A InovaTech Solutions é uma empresa de tecnologia focada em desenvolver soluções inovadoras para impulsionar negócios. Nossa equipe apaixonada por tecnologia está comprometida em criar produtos que transformam indústrias e melhoram a vida das pessoas.")
    Empresa e2=new Empresa("GlobalTrade Inc.", "98.765.432/0001-02", "Estados Unidos", "info@globaltradeinc.com", "Nova York", "10001", "A GlobalTrade Inc. é uma empresa líder em comércio internacional, conectando empresas de todo o mundo. Nossa missão é facilitar negócios globais por meio de soluções de logística avançadas e parcerias estratégicas.")
    Empresa e3=new Empresa("CreativeMinds Agency", "23.456.789/0001-03", "Australia", "hello@creativemindsagency.co.au", "Queensland", "32056", "A CreativeMinds Agency é uma agência de marketing criativo que oferece soluções inovadoras para impulsionar marcas. Nossa equipe talentosa de designers, redatores e estrategistas colabora para criar campanhas que cativam audiências e geram resultados tangíveis.")
    Empresa e4=new Empresa("GreenTech", "34.567.890/0001-04", "Canada", "contact@greentechinnovations.ca", "Ontario", "M5V 2L7", "A GreenTech Innovations é uma empresa comprometida com a sustentabilidade e a inovação. Estamos dedicados a desenvolver tecnologias eco-friendly que contribuam para um futuro mais verde e saudável.")
    Empresa e5=new Empresa("HealthCure Solutions", "45.678.901/0001-05", "Estados Unidos", "info@healthcuresolutions.com.us", "Georgia", "30004", "Pessoal: A HealthCure Solutions é uma empresa pioneira em soluções de saúde digital. Nossa missão é melhorar o acesso e a qualidade dos cuidados de saúde por meio de plataformas tecnológicas inovadoras, beneficiando pacientes e profissionais da área.")
    e1.addCompetencia("Javascript")
    e1.addCompetencia("Python")
    e3.addCompetencia("Corel")
    empresas.add(e1)
    empresas.add(e2)
    empresas.add(e3)
    empresas.add(e4)
    empresas.add(e5)



    def loop=true
    while(loop){

        Menu.displayMenu()
        def input = System.in.newReader().readLine()
        def i= Validacao.opcaoValida(input)

        switch (i) {
            case 1:

                candidatos.add(Menu.criarCandidato())
                break

            case 2:

                empresas.add(Menu.criarEmpresa())
                break

            case 3:

                println("Listando todos os candidatos...\n")
                if(candidatos.isEmpty()){
                    println("Nenhum candidato encontrado.")
                }
                else {
                    int j = 1
                    for (Candidato candidato : candidatos) {
                        println("   Candidato ${j}")
                        println(candidato)
                        j++
                    }
                }
                break

            case 4:

                if(empresas.isEmpty()){
                    println("Nenhuma empresa encontrada.")
                }
                else {
                    int j = 1
                    println("Listando todos as empresas...\n")
                    for (Empresa empresa : empresas) {
                        println("   Empresa ${j}")
                        println(empresa)
                        j++
                    }
                }
                break

            case 5:

                println("Deletando todos os candidatos...\n")
                candidatos.clear()
                break

            case 6:

                println("Deletando todos as empresas...\n")
                empresas.clear()
                break

            case 7:

                loop=false
                break

            default:

                println("Opção Inválida.")
                break

        }
    }
}

