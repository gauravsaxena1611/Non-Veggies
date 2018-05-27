package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NvReferrerCacheId generated by hbm2java
 */
@Embeddable
public class NvReferrerCacheId implements java.io.Serializable {

	private int idConnectionsSource;
	private int idReferrer;

	public NvReferrerCacheId() {
	}

	public NvReferrerCacheId(int idConnectionsSource, int idReferrer) {
		this.idConnectionsSource = idConnectionsSource;
		this.idReferrer = idReferrer;
	}

	@Column(name = "id_connections_source", nullable = false)
	public int getIdConnectionsSource() {
		return this.idConnectionsSource;
	}

	public void setIdConnectionsSource(int idConnectionsSource) {
		this.idConnectionsSource = idConnectionsSource;
	}

	@Column(name = "id_referrer", nullable = false)
	public int getIdReferrer() {
		return this.idReferrer;
	}

	public void setIdReferrer(int idReferrer) {
		this.idReferrer = idReferrer;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NvReferrerCacheId))
			return false;
		NvReferrerCacheId castOther = (NvReferrerCacheId) other;

		return (this.getIdConnectionsSource() == castOther.getIdConnectionsSource()) && (this.getIdReferrer() == castOther.getIdReferrer());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdConnectionsSource();
		result = 37 * result + this.getIdReferrer();
		return result;
	}

}