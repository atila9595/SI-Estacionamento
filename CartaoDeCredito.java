
public class CartaoDeCredito {
	// atributos ou propriedades ou variáveis de instância
	int numero;
	double totalFatura;

	// método para retornar todos os dados
	public String retornarDados() {
		String aux = "";
		aux += "Número -> " + numero + "\n";
		aux += "Total da fatura -> R$ " + totalFatura + "\n";
		return aux;
	}
	
	//método para retornar o total da fatura
	public double consultarFatura() {
		return totalFatura;
	}
}
