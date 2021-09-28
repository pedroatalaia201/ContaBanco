
abstract class ContaBancaria {
	
	String senha;
	int numero;
	
	public abstract void saca(double valor);
	public abstract void deposito(double valor);
	public abstract void tiraExtrato();
	public abstract void alterarSenha(String senha);
}
