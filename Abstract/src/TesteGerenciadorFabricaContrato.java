import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteGerenciadorFabricaContrato {

    @Test
    public void testeObterFabricaPessoaFisica() {
        GerenciadorFabricaContrato gerenciador = new GerenciadorFabricaContrato();
        FabricaContrato fabrica = gerenciador.obterFabrica("FabricaContratoPessoaFisica");
        assertNotNull(fabrica, "A fábrica de contratos para pessoa física não deveria ser nula");

        Contrato contrato = fabrica.criarContrato();
        assertNotNull(contrato, "O contrato para pessoa física não deveria ser nulo");
        assertTrue(contrato instanceof ContratoPessoaFisica, "O contrato não é do tipo esperado");
        contrato.imprimir();
    }

    @Test
    public void testeObterFabricaPessoaJuridica() {
        GerenciadorFabricaContrato gerenciador = new GerenciadorFabricaContrato();
        FabricaContrato fabrica = gerenciador.obterFabrica("FabricaContratoPessoaJuridica");
        assertNotNull(fabrica, "A fábrica de contratos para pessoa jurídica não deveria ser nula");

        Contrato contrato = fabrica.criarContrato();
        assertNotNull(contrato, "O contrato para pessoa jurídica não deveria ser nulo");
        assertTrue(contrato instanceof ContratoPessoaJuridica, "O contrato não é do tipo esperado");
        contrato.imprimir();
    }
}
