
import javax.swing.JOptionPane;
import java.util.Scanner;

public class ContaCorrente extends ContaBancaria{
	private String senha;
	public int numero;
	public double saldo = 0;
	public int qtdeTransacoes = 0;
	
	public ContaCorrente(String senha, int numero) {
		this.senha = senha;
		this.numero = numero;
	}
	
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void saca(double valor) { 
		saldo = (saldo - valor);
		qtdeTransacoes++;
	}
	
	@Override
	public void deposito(double valor) {
		saldo = (saldo + valor);
		qtdeTransacoes++;
	}
	
	
	@Override
	public void tiraExtrato() {
		JOptionPane.showMessageDialog(null, "Quantidade de transações: " + qtdeTransacoes);
		JOptionPane.showMessageDialog(null, "Saldo atual R$ " + saldo);
	}
	
	@Override 
	public void alterarSenha(String senha) {
		if(this.senha == senha) {
			System.out.print("Digite a nova senha: ");
			String novaSenha = scan.nextLine();
			
			setSenha(novaSenha);
		}
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
