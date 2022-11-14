package dio_banco;

public class Main {

	public static void main(String[] args) {
		Cliente valdeir = new Cliente();
		valdeir.setNome("Valdeir");
		
		Conta cc = new ContaCorrente(valdeir);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(valdeir);
		
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
