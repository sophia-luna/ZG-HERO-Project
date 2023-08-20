package mypackage
import org.junit.jupiter.api.Test
import static junit.framework.TestCase.*

class ValidacaoTeste {

    @Test
    void opcaoValidaTeste(){

        boolean resultado=Validacao.opcaoValida("0")
        assertFalse(resultado)
        resultado=Validacao.opcaoValida("9")
        assertFalse(resultado)

        resultado=Validacao.opcaoValida("1")
        assertTrue(resultado)
        resultado=Validacao.opcaoValida("7")
        assertTrue(resultado)

    }

    @Test
    void idadeValidaTeste(){

        boolean resultado=Validacao.idadeValida("0")
        assertFalse(resultado)
        resultado=Validacao.idadeValida("5")
        assertFalse(resultado)
        resultado=Validacao.idadeValida("120")
        assertFalse(resultado)

        resultado=Validacao.idadeValida("18")
        assertTrue(resultado)
        resultado=Validacao.idadeValida("30")
        assertTrue(resultado)
        resultado=Validacao.idadeValida("45")
        assertTrue(resultado)

    }

    @Test
    void respostaValidaTeste(){

        boolean resultado=Validacao.respostaValida("s")
        assertTrue(resultado)
        resultado=Validacao.respostaValida("n")
        assertTrue(resultado)

        resultado=Validacao.respostaValida("a")
        assertFalse(resultado)
        resultado=Validacao.respostaValida("z")
        assertFalse(resultado)
        resultado=Validacao.respostaValida("1")
        assertFalse(resultado)
        resultado=Validacao.respostaValida("#qualquer outro input")
        assertFalse(resultado)

    }
}
