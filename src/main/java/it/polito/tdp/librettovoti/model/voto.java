package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
/**
 * memorizza il risultato di un esame singolo
 * @author Francesco Pacucci
 *
 */
public class voto {
	private String nome;
	private int voto; //30L come lo rappresrnto?
	private LocalDate data;
	
	/**
	 * 
	 * @param nome nome del corso superato
	 * @param voto voto dell'esame
	 * @param data data dll'esame superato
	 */
	
	public voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame " +nome+ " superato con " + voto + " il " +data;
	}
	
	
	
	
	

}
