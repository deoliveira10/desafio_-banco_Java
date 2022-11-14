package dio_banco;

public class ContaCorrente extends Conta {

	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}
	@Override
	public void imprimirExtrato() {
		System.out.print("=== Extrato Conta Corrente ===");
		super.imprimirInfoComuns();
		
	}

	

	
	
	
}
