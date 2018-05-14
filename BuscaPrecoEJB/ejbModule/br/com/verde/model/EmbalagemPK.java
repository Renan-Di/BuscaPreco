package br.com.verde.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PCEMBALAGEM database table.
 * 
 */
@Embeddable
public class EmbalagemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long codauxiliar;

	private String codfilial;

	public EmbalagemPK() {
	}
	public long getCodauxiliar() {
		return this.codauxiliar;
	}
	public void setCodauxiliar(long codauxiliar) {
		this.codauxiliar = codauxiliar;
	}
	public String getCodfilial() {
		return this.codfilial;
	}
	public void setCodfilial(String codfilial) {
		this.codfilial = codfilial;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EmbalagemPK)) {
			return false;
		}
		EmbalagemPK castOther = (EmbalagemPK)other;
		return 
			(this.codauxiliar == castOther.codauxiliar)
			&& this.codfilial.equals(castOther.codfilial);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.codauxiliar ^ (this.codauxiliar >>> 32)));
		hash = hash * prime + this.codfilial.hashCode();
		
		return hash;
	}
}