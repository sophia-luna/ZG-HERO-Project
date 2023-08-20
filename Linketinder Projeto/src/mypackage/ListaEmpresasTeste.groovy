package mypackage

import org.junit.Before
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ListaEmpresasTeste {

    ListaEmpresas empresas
    @BeforeEach
    void setUp(){
        empresas=new ListaEmpresas()
        Empresa e1=new Empresa("InovaTech Solutions", "12.345.678/0001-01", "Brasil", "contato@inovatechsolutions.com", "São Paulo", "12345-678", "A InovaTech Solutions é uma empresa de tecnologia focada em desenvolver soluções inovadoras para impulsionar negócios. Nossa equipe apaixonada por tecnologia está comprometida em criar produtos que transformam indústrias e melhoram a vida das pessoas.")
        Empresa e2=new Empresa("GlobalTrade Inc.", "98.765.432/0001-02", "Estados Unidos", "info@globaltradeinc.com", "Nova York", "10001", "A GlobalTrade Inc. é uma empresa líder em comércio internacional, conectando empresas de todo o mundo. Nossa missão é facilitar negócios globais por meio de soluções de logística avançadas e parcerias estratégicas.")
        empresas.cadastrarEmpresa(e1)
        empresas.cadastrarEmpresa(e2)
    }

    @Test
    void cadastrarEmpresaTeste(){
        Empresa e3=new Empresa("CreativeMinds Agency", "23.456.789/0001-03", "Australia", "hello@creativemindsagency.co.au", "Queensland", "32056", "A CreativeMinds Agency é uma agência de marketing criativo que oferece soluções inovadoras para impulsionar marcas. Nossa equipe talentosa de designers, redatores e estrategistas colabora para criar campanhas que cativam audiências e geram resultados tangíveis.")
        empresas.cadastrarEmpresa(e3)
        assert empresas.size()==3
    }

    @Test
    void ListarTeste(){
        Empresa e4=new Empresa("GreenTech", "34.567.890/0001-04", "Canada", "contact@greentechinnovations.ca", "Ontario", "M5V 2L7", "A GreenTech Innovations é uma empresa comprometida com a sustentabilidade e a inovação. Estamos dedicados a desenvolver tecnologias eco-friendly que contribuam para um futuro mais verde e saudável.")
        empresas.cadastrarEmpresa(e4)
        LinkedList<Empresa>copia=empresas.listar()
        assert empresas.size()==3
        assert copia[2]==e4
    }

    @Test
    void limparListaTeste(){
        empresas.limparLista()
        assert empresas.size()==0
    }
}
