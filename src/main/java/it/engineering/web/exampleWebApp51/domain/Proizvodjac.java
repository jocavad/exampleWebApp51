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
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private String pib;

	private String naziv;
	
	private String adresa;

	@Column(name="mat_broj")
	private String matBroj;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ptt")
	private Mesto mesto;
	
	public Proizvodjac() {
	}

	public Proizvodjac(String pib, String naziv, String adresa, String matBroj, Mesto mesto) {
		super();
		this.pib = pib;
		this.naziv = naziv;
		this.adresa = adresa;
		this.matBroj = matBroj;
		this.mesto = mesto;
	}



	public String getPib() {
		return this.pib;
	}

	public void setPib(String pib) {
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
	
	public String getMatBroj() {
		return this.matBroj;
	}

	public void setMatBroj(String matBroj) {
		this.matBroj = matBroj;
	}

	public Mesto getMesto() {
		return this.mesto;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

}