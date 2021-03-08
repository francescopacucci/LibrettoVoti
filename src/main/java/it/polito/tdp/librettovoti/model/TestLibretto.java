package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		System.out.println("test metodi di libretto");
		libretto libretto = new libretto();

		voto voto1 = new voto("Analisi1", 30, LocalDate.of(2019, 2, 15));
		libretto.add(voto1);
		libretto.add(new voto("Fisica1", 28, LocalDate.of(2019, 7, 15)));
		libretto.add(new voto("Informatica", 26, LocalDate.of(2019, 9, 15)));
		
		System.out.println(libretto);

	}
}
