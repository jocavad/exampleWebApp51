package it.engineering.web.exampleWebApp51.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the proizvodjac database table.
 * 
 */
@Entity
@NamedQuery(name="Proizvodjac.findAll", query="SELECT p FROM Proizvodjac p")
public class Proizvodjac implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pib;

	private String naziv;
	
	private String adresa;

	@Column(name="mat_broj")
	private int matBroj;

	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name="ptt")
	private Mesto mesto;
	
	public Proizvodjac() {
	}

	public int getPib() {
		return this.pib;
	}

	public void setPib(int pib) {
		this.pib = pib;
	}

	public String getAdresa() {
		return this.adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public int getMatBroj() {
		return this.matBroj;
	}

	public void setMatBroj(int matBroj) {
		this.matBroj = matBroj;
	}

	public Mesto getMesto() {
		return this.mesto;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

}