package SubClasse;

import SuperClasse.ContaBancaria;

public class ContaPoupanca extends ContaBancaria{
	
	private int diasRendimento;
	
	public ContaPoupanca(String nomeCliente, int numeroConta, double saldo) {
		super(nomeCliente, numeroConta, saldo);
	}
	
	public int getDiasRendimento() {
		return diasRendimento;
	}

	public void setDiasRendimento(int diasRendimento) {
		this.diasRendimento = diasRendimento;
	}

	public void calcularNovoSaldo(double rendimentos) {
		this.setSaldo(this.getSaldo()+(this.getDiasRendimento()*rendimentos));
	}
}
