package dio_banco;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.print("=== Extrato Conta Poupanca ===");
		super.imprimirInfoComuns();
		
	}

	


	
}
