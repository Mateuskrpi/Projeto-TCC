package androidpro.com.tcc_task;

import junit.framework.TestCase;

import androidpro.com.tcc_task.models.Prestador;

public class PrestadorTest extends TestCase {
    public void testePrestadorComIdadeMenorQue18anosNaoPodeVotar(){
        Prestador p = new Prestador("Felipe", 10);
        boolean resultado = p.idadePrestador();
        assertFalse(resultado);
    }
}
