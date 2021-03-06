package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvTaxRule generated by hbm2java
 */
@Entity
@Table(name = "nv_tax_rule", catalog = "NVPrestashop")
public class NvTaxRule implements java.io.Serializable {

	private Integer idTaxRule;
	private int idTaxRulesGroup;
	private int idCountry;
	private int idState;
	private String zipcodeFrom;
	private String zipcodeTo;
	private int idTax;
	private int behavior;
	private String description;

	public NvTaxRule() {
	}

	public NvTaxRule(int idTaxRulesGroup, int idCountry, int idState, String zipcodeFrom, String zipcodeTo, int idTax, int behavior, String description) {
		this.idTaxRulesGroup = idTaxRulesGroup;
		this.idCountry = idCountry;
		this.idState = idState;
		this.zipcodeFrom = zipcodeFrom;
		this.zipcodeTo = zipcodeTo;
		this.idTax = idTax;
		this.behavior = behavior;
		this.description = description;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_tax_rule", unique = true, nullable = false)
	public Integer getIdTaxRule() {
		return this.idTaxRule;
	}

	public void setIdTaxRule(Integer idTaxRule) {
		this.idTaxRule = idTaxRule;
	}

	@Column(name = "id_tax_rules_group", nullable = false)
	public int getIdTaxRulesGroup() {
		return this.idTaxRulesGroup;
	}

	public void setIdTaxRulesGroup(int idTaxRulesGroup) {
		this.idTaxRulesGroup = idTaxRulesGroup;
	}

	@Column(name = "id_country", nullable = false)
	public int getIdCountry() {
		return this.idCountry;
	}

	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}

	@Column(name = "id_state", nullable = false)
	public int getIdState() {
		return this.idState;
	}

	public void setIdState(int idState) {
		this.idState = idState;
	}

	@Column(name = "zipcode_from", nullable = false, length = 12)
	public String getZipcodeFrom() {
		return this.zipcodeFrom;
	}

	public void setZipcodeFrom(String zipcodeFrom) {
		this.zipcodeFrom = zipcodeFrom;
	}

	@Column(name = "zipcode_to", nullable = false, length = 12)
	public String getZipcodeTo() {
		return this.zipcodeTo;
	}

	public void setZipcodeTo(String zipcodeTo) {
		this.zipcodeTo = zipcodeTo;
	}

	@Column(name = "id_tax", nullable = false)
	public int getIdTax() {
		return this.idTax;
	}

	public void setIdTax(int idTax) {
		this.idTax = idTax;
	}

	@Column(name = "behavior", nullable = false)
	public int getBehavior() {
		return this.behavior;
	}

	public void setBehavior(int behavior) {
		this.behavior = behavior;
	}

	@Column(name = "description", nullable = false, length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
