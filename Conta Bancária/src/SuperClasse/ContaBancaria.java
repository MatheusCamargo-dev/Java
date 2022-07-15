package SuperClasse;

public class ContaBancaria {
	private String nomeCliente;
	private int numeroConta;
	private double saldo;
	
	public ContaBancaria() {
		
	}
	public ContaBancaria(String nomeCliente, int numeroConta, double saldo) {
		this.setNomeCliente(nomeCliente);
		this.setNumeroConta(numeroConta);
		this.setSaldo(saldo);
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo()+valor);
	}
	
	public void sacar(double valor) {
		if (this.getSaldo()>=valor) {
			this.setSaldo(this.getSaldo()-valor);
		}
		else {
			System.out.println("Valor excede o saldo!");
		}
	}
	public void imprimirSaldo() {
		System.out.println("Nome do cliente:"+this.getNomeCliente());
		System.out.println("Numero da conta:"+this.getNumeroConta());
		System.out.println("Saldo da conta:"+this.getSaldo());
	}
}
