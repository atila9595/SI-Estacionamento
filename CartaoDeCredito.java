
public class CartaoDeCredito {
	// atributos ou propriedades ou vari�veis de inst�ncia
	int numero;
	double totalFatura;

	// m�todo para retornar todos os dados
	public String retornarDados() {
		String aux = "";
		aux += "N�mero -> " + numero + "\n";
		aux += "Total da fatura -> R$ " + totalFatura + "\n";
		return aux;
	}
	
	//m�todo para retornar o total da fatura
	public double consultarFatura() {
		return totalFatura;
	}
}
