package it.engineering.web.exampleWebApp51.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mesto database table.
 * 
 */
@Entity
@NamedQuery(name="Mesto.findAll", query="SELECT m FROM Mesto m")
public class Mesto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ptt;

	private String naziv;

	//bi-directional many-to-one association to Proizvodjac
//	@OneToMany(mappedBy="mesto")
//	private List<Proizvodjac> proizvodjacs;

	public Mesto() {
	}

	public Mesto(int ptt, String naziv) {
		this.ptt = ptt;
		this.naziv = naziv;
	}

	public int getPtt() {
		return this.ptt;
	}

	public void setPtt(int ptt) {
		this.ptt = ptt;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

//	public List<Proizvodjac> getProizvodjacs() {
//		return this.proizvodjacs;
//	}

//	public void setProizvodjacs(List<Proizvodjac> proizvodjacs) {
//		this.proizvodjacs = proizvodjacs;
//	}

//	public Proizvodjac addProizvodjac(Proizvodjac proizvodjac) {
//		getProizvodjacs().add(proizvodjac);
//		proizvodjac.setMesto(this);
//
//		return proizvodjac;
//	}

//	public Proizvodjac removeProizvodjac(Proizvodjac proizvodjac) {
//		getProizvodjacs().remove(proizvodjac);
//		proizvodjac.setMesto(null);
//
//		return proizvodjac;
//	}

}