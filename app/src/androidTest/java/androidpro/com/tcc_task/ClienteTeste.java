package androidpro.com.tcc_task;

import junit.framework.TestCase;

import org.junit.Test;

import androidpro.com.tcc_task.models.Cliente;

public class ClienteTeste extends TestCase {
    public void testClienteComIdadeMenorQue18NaoPodeAcessar(){
        Cliente c = new Cliente("Mateus",10);
        boolean resultado = c.idadeCliente();
        assertFalse(resultado);

    }
}


