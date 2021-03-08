package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class libretto {
	
	private List<voto> voti;

	public libretto() {
		this.voti=new ArrayList<>();
	}
	
	public void add(voto v) {
		this.voti.add(v);
	}
	
/*	public String votiuguali(int punteggio) {
		//calcola una stringa che continee i voti
		//sara poi il chiamante a stamparle
	}  */
	
	public List<voto> votiuguali2 (int punteggio){
		//restituisce solo i voti uguali al criterio
		List<voto> ris = new ArrayList<>();
		for(voto v : this.voti) {
			if(v.getVoto()==punteggio) {
				ris.add(v);	
			}
		}
		return ris;
	}
	
	public libretto votiuguali3(int punteggio) {
	     libretto ris = new libretto();
	     for(voto v: this.voti) {
	    	 if(v.getVoto()==punteggio) {
	    		 ris.add(v);
	    	//	 ris.voti.add(v);
	    	 }
	     }
	     return ris;
	}
	
	
	
	public String toString() {
		//return this.voti.toString();
		String s = "";
		for( voto v : this.voti) {
			s = s+v.toString() + "\n";
		}
		return s;
	}
}
