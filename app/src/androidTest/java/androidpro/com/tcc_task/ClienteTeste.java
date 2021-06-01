package androidpro.com.tcc_task;

import junit.framework.TestCase;

import androidpro.com.tcc_task.models.Cliente;

public class ClienteTeste extends TestCase {
    public void testClienteComIdadeMenorQue18NaoPodeTrabalhar(){
        Cliente c = new Cliente("Mateus",10);
        boolean resultado = c.idadeCliente();
        assertFalse(resultado);

    }
}
