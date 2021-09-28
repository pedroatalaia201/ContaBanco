
import javax.swing.JOptionPane;
import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria{
	private String senha;
	public int numero;
	public double saldo;
	public double taxaRendimento;
	
	public ContaPoupanca(String senha, int numero, double taxa) {
		this.senha = senha;
		this.numero = numero;
		taxaRendimento = taxa;
	}
	
	Scanner scan = new Scanner(System.in);

	@Override
	public void saca(double valor) {
		saldo = (saldo - valor);	
	}

	@Override
	public void deposito(double valor) {
		saldo = (saldo + valor);
	}

	@Override
	public void tiraExtrato() {
		JOptionPane.showMessageDialog(null, "Taxa de rendimento: " + taxaRendimento);
		JOptionPane.showMessageDialog(null, "Total do saldo" + saldo + (saldo * taxaRendimento));
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
