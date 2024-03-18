public class FabricaContratoPessoaJuridica implements FabricaContrato {
    @Override
    public Contrato criarContrato() {
                return new ContratoPessoaJuridica();
    }
}
