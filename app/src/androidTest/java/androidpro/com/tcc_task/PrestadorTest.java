package androidpro.com.tcc_task;

import junit.framework.TestCase;

import org.junit.Test;

import androidpro.com.tcc_task.models.Prestador;

public class PrestadorTest extends TestCase {
    public void testePrestadorComIdadeMenorQue18anosNaoTrabalha(){
        Prestador p = new Prestador("Felipe", 10);
        boolean resultado = p.idadePrestador();
        assertFalse(resultado);
    }
    @Test
    public void testVerificaIdade(){
        assertEquals(21, d.verificaData(20,1999));
    }
}




