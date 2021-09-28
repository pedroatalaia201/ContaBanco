
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<ContaPoupanca> poupanca = new ArrayList();
		List<ContaCorrente> corrente = new ArrayList();
		
		for(int i = 0; i < 4; i++) {
			JOptionPane.showMessageDialog(null, "Insira os dados da conta bancária:");
			String senha = JOptionPane.showInputDialog("Senha: ");
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
			
			int option = Integer.parseInt(JOptionPane.showInputDialog("Essa conta é:\n1-Conta Poupança\n2-Conta Corrente"));
			
			if(option == 1) {
				double taxa = Double.parseDouble(JOptionPane.showInputDialog("Insira a taxa de rendimento:"));
				
				poupanca.add(new ContaPoupanca(senha, numero, taxa));								
			}
			else {
				corrente.add(new ContaCorrente(senha, numero));
			}
		}
		
		while(true) {
			int option = Integer.parseInt(JOptionPane.showInputDialog("Sua conta é\n1- CC\n2- Cp"));
			
			if(option == 1) {
				JOptionPane.showMessageDialog(null, "Deseja realizar alguma das operações a seguir?");
				int opp = Integer.parseInt(JOptionPane.showInputDialog("1-Saque.\n2-Deposito.\n3-Extrato\n4-Alterar senha\n5-Sair"));
				int numC = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua conta: "));
				
				switch(opp) {
					case 1:{
						for(ContaCorrente conta : corrente) {
							if(conta.numero == numC) {
								double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
								conta.saca(valor);
								return;
							}
						}
					}
					case 2:{
						for(ContaCorrente conta : corrente) {
							if(conta.numero == numC) {
								double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));
								conta.deposito(valor);
								return;
							}
						}
					}
					case 3:{
						for(ContaCorrente conta : corrente) {
							if(conta.numero == numC) {
								conta.tiraExtrato();
								return;
							}
						}
					}
					case 4:{
						for(ContaCorrente conta : corrente) {
							if(conta.numero == numC) {
								String senha = JOptionPane.showInputDialog("Digite a sua senha atual");
								conta.alterarSenha(senha);
								return;
							}
						}
					}
					case 5:{
						break;
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Deseja realizar alguma das operações a seguir?");
				int opp = Integer.parseInt(JOptionPane.showInputDialog("1-Saque.\n2-Deposito.\n3-Extrato\n4-Alterar senha\n5-Sair"));
				int numC = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua conta: "));
				
				switch(opp) {
					case 1:{
						for(ContaPoupanca conta : poupanca) {
							if(conta.numero == numC) {
								double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
								conta.saca(valor);
								return;
							}
						}
					}
					case 2:{
						for(ContaPoupanca conta : poupanca) {
							if(conta.numero == numC) {
								double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));
								conta.deposito(valor);
								return;
							}
						}
					}
					case 3:{
						for(ContaPoupanca conta : poupanca) {
							if(conta.numero == numC) {
								conta.tiraExtrato();
								return;
							}
						}
					}
					case 4:{
						for(ContaPoupanca conta : poupanca) {
							if(conta.numero == numC) {
								String senha = JOptionPane.showInputDialog("Digite a sua senha atual");
								conta.alterarSenha(senha);
								return;
							}
						}
					}
					case 5:{
						break;
					}
				}
			}						
		}						
	}
	
}
