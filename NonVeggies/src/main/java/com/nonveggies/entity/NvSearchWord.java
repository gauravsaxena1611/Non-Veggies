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
 * NvSearchWord generated by hbm2java
 */
@Entity
@Table(name = "nv_search_word", catalog = "NVPrestashop", uniqueConstraints = @UniqueConstraint(columnNames = { "id_lang", "id_shop", "word" }))
public class NvSearchWord implements java.io.Serializable {

	private Integer idWord;
	private int idShop;
	private int idLang;
	private String word;

	public NvSearchWord() {
	}

	public NvSearchWord(int idShop, int idLang, String word) {
		this.idShop = idShop;
		this.idLang = idLang;
		this.word = word;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_word", unique = true, nullable = false)
	public Integer getIdWord() {
		return this.idWord;
	}

	public void setIdWord(Integer idWord) {
		this.idWord = idWord;
	}

	@Column(name = "id_shop", nullable = false)
	public int getIdShop() {
		return this.idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	@Column(name = "id_lang", nullable = false)
	public int getIdLang() {
		return this.idLang;
	}

	public void setIdLang(int idLang) {
		this.idLang = idLang;
	}

	@Column(name = "word", nullable = false, length = 15)
	public String getWord() {
		return this.word;
	}

	public void setWord(String word) {
		this.word = word;
	}

}
