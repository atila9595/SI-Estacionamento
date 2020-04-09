package Main;

import Bilhete.*;
import Bilhete.usuario.*;
import Tipo.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Tela {
	
	private static Bilhete[] bilhete = new Bilhete[10];
	private static int posicao = 0;
	
	public static void main(String[] args) {
		String entrada;
		
		do {
			entrada = showInputDialog("Senha cpf ou sair");
			if (entrada.equals("admin")) {
				moduloAdministrativo();
				
			}
		} while (!entrada.equalsIgnoreCase("sair"));
		
	}

	public static void moduloAdministrativo() {
		int opcao;
		do {
			opcao = parseInt(showInputDialog(menuAdm()));
			if (opcao < 1 || opcao > 4 ) {
				showMessageDialog(null, "opção invaloda");
			}else {
				switch (opcao) {
				case 1:
					emitirBilhete();
					
					break;
				case 2:
					imprimiBilhete();
					
					break;
				case 3:
					consultaBilhete();
					
					break;
				}
			}
		} while (opcao != 4);
		
	}
	private static void consultaBilhete() {
		// TODO Auto-generated method stub
		
	}

	private static void imprimiBilhete() {
		// TODO Auto-generated method stub
		
	}

	private static void emitirBilhete() {
		String cpf = showInputDialog("Informe o CPF");
		if (consulta(cpf) != -1) {
			showMessageDialog(null, "CPF já tem bilhete emitido");	
		} else {
			
		}
		
	}

	private static int consulta(String cpf) {
		int aux = -1;
		for (int i = 0; i < posicao; i++) {
			if (bilhete[i].getUsuario().getCpf().equals(cpf)) {
				aux = i;
				
			}
			
		}
		return aux;
	}

	public static String menuAdm() {
		String aux = "escolha uma opção\n";
		aux += "1 emitir bilhete\n";
		aux += "2 imprimi bilhete\n";
		aux += "3 consulta bilhete\n";
		aux += "4 sair";
		return aux;
	}
	public static String menuUser() {
		String aux = "escolha uma opção\n";
		aux += "1 carregar bilhete\n";
		aux += "2 passa na catraca\n";
		aux += "3 consulta saldo\n";
		aux += "4 sair";
		return aux;
				
	}
	
	

}
