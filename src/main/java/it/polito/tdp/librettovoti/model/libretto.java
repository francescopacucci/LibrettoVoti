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
	
	public String toString() {
		//return this.voti.toString();
		String s = "";
		for( voto v : this.voti) {
			s = s+v.toString() + "\n";
		}
		return s;
	}
}
