package Bilhete;
import Bilhete.usuario.*;
import Tipo.TipoDeUsuario;

public class Bilhete {
	private int numero;
	private Usuario usuario;
	private double saldo;
	private final static double valorDaPassagem =4.40;
	
	public Bilhete (int numero, Usuario usuario, double saldo) {
		this.numero = numero;
		this.usuario = usuario;
		this.saldo = saldo;
		
	}
	public void carregar(double valor) {
	
	saldo += valor;
	
	}
	public void passarNaCatraca() {
		if (usuario.getTipo().equals(TipoDeUsuario.NORMAL)) {
			saldo -= valorDaPassagem;
		} else {
			saldo -= valorDaPassagem/2;
		}
	}
	public String getDados() {
		String aux = "";
		aux += "numero do bilhete = "+numero+"\n";
		aux += usuario.getDados();
		aux += "Saldo = "+String.format("%.2f", saldo)+"\n";
		return aux;
		
	}
	public int getNumero() {
		return numero;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public double getSaldo() {
		return saldo;
	}
	public static double getValordapassagem() {
		return valorDaPassagem;
	}
 }
