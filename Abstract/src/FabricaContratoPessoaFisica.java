public class FabricaContratoPessoaFisica implements FabricaContrato {
    @Override
    public Contrato criarContrato() {
                return new ContratoPessoaFisica();
    }
}

