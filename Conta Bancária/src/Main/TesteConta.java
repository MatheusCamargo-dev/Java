package Main;

import SubClasse.ContaEspecial;
import SubClasse.ContaPoupanca;
import SuperClasse.ContaBancaria;

public class TesteConta {
	public static void main(String Args[]) {
		ContaBancaria contaCorrente = new ContaBancaria("Matheus", 24, 10000);
		contaCorrente.sacar(1000);
		contaCorrente.imprimirSaldo();
		contaCorrente.depositar(500);
		System.out.println("Saldo:"+contaCorrente.getSaldo());
		System.out.println("==================================");
		ContaPoupanca contaCorrente2 = new ContaPoupanca("Jazz",25,5000);
		contaCorrente2.sacar(1000);
		contaCorrente2.imprimirSaldo();
		contaCorrente2.setDiasRendimento(15);
		contaCorrente2.calcularNovoSaldo(100);
		System.out.println("Saldo com rendimentos:"+contaCorrente2.getSaldo());
		System.out.println("==================================");
		ContaEspecial contaCorrente3 = new ContaEspecial("Devedor",66,1000,1500);
		contaCorrente3.imprimirSaldo();
		contaCorrente3.sacar(1500);
		System.out.println("Saldo:"+contaCorrente3.getSaldo());
	}
}
