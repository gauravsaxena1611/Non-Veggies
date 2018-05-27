package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * NvThemeMeta generated by hbm2java
 */
@Entity
@Table(name = "nv_theme_meta", catalog = "NVPrestashop", uniqueConstraints = @UniqueConstraint(columnNames = { "id_theme", "id_meta" }))
public class NvThemeMeta implements java.io.Serializable {

	private Integer idThemeMeta;
	private int idTheme;
	private int idMeta;
	private boolean leftColumn;
	private boolean rightColumn;

	public NvThemeMeta() {
	}

	public NvThemeMeta(int idTheme, int idMeta, boolean leftColumn, boolean rightColumn) {
		this.idTheme = idTheme;
		this.idMeta = idMeta;
		this.leftColumn = leftColumn;
		this.rightColumn = rightColumn;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_theme_meta", unique = true, nullable = false)
	public Integer getIdThemeMeta() {
		return this.idThemeMeta;
	}

	public void setIdThemeMeta(Integer idThemeMeta) {
		this.idThemeMeta = idThemeMeta;
	}

	@Column(name = "id_theme", nullable = false)
	public int getIdTheme() {
		return this.idTheme;
	}

	public void setIdTheme(int idTheme) {
		this.idTheme = idTheme;
	}

	@Column(name = "id_meta", nullable = false)
	public int getIdMeta() {
		return this.idMeta;
	}

	public void setIdMeta(int idMeta) {
		this.idMeta = idMeta;
	}

	@Column(name = "left_column", nullable = false)
	public boolean isLeftColumn() {
		return this.leftColumn;
	}

	public void setLeftColumn(boolean leftColumn) {
		this.leftColumn = leftColumn;
	}

	@Column(name = "right_column", nullable = false)
	public boolean isRightColumn() {
		return this.rightColumn;
	}

	public void setRightColumn(boolean rightColumn) {
		this.rightColumn = rightColumn;
	}

}
