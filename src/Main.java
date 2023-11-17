import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		List<Conta> bclist = new ArrayList<Conta>();
		
		Banco bc = new Banco();
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(1000);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		System.out.println(" ");
		
		cc.sacar(1000);
		
		bc.setNome("Banco DIO");
		bc.setContas(bclist);
		bclist.add(cc);
		bclist.add(poupanca);
		
		System.out.println(" ");
		
		for (Conta conta : bclist) {
			System.out.println(conta.cliente.getNome());
			System.out.println(conta.numero);
		}
	}

}
