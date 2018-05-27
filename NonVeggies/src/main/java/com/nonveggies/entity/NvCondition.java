package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NvCondition generated by hbm2java
 */
@Entity
@Table(name = "nv_condition", catalog = "NVPrestashop")
public class NvCondition implements java.io.Serializable {

	private NvConditionId id;
	private String type;
	private String request;
	private String operator;
	private String value;
	private String result;
	private String calculationType;
	private String calculationDetail;
	private boolean validated;
	private Date dateAdd;
	private Date dateUpd;

	public NvCondition() {
	}

	public NvCondition(NvConditionId id, String type, boolean validated, Date dateAdd, Date dateUpd) {
		this.id = id;
		this.type = type;
		this.validated = validated;
		this.dateAdd = dateAdd;
		this.dateUpd = dateUpd;
	}

	public NvCondition(NvConditionId id, String type, String request, String operator, String value, String result, String calculationType,
					String calculationDetail, boolean validated, Date dateAdd, Date dateUpd) {
		this.id = id;
		this.type = type;
		this.request = request;
		this.operator = operator;
		this.value = value;
		this.result = result;
		this.calculationType = calculationType;
		this.calculationDetail = calculationDetail;
		this.validated = validated;
		this.dateAdd = dateAdd;
		this.dateUpd = dateUpd;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idCondition", column = @Column(name = "id_condition", nullable = false)),
			@AttributeOverride(name = "idPsCondition", column = @Column(name = "id_ps_condition", nullable = false)) })
	public NvConditionId getId() {
		return this.id;
	}

	public void setId(NvConditionId id) {
		this.id = id;
	}

	@Column(name = "type", nullable = false, length = 14)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "request", length = 65535)
	public String getRequest() {
		return this.request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	@Column(name = "operator", length = 32)
	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Column(name = "value", length = 64)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "result", length = 64)
	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Column(name = "calculation_type", length = 5)
	public String getCalculationType() {
		return this.calculationType;
	}

	public void setCalculationType(String calculationType) {
		this.calculationType = calculationType;
	}

	@Column(name = "calculation_detail", length = 64)
	public String getCalculationDetail() {
		return this.calculationDetail;
	}

	public void setCalculationDetail(String calculationDetail) {
		this.calculationDetail = calculationDetail;
	}

	@Column(name = "validated", nullable = false)
	public boolean isValidated() {
		return this.validated;
	}

	public void setValidated(boolean validated) {
		this.validated = validated;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_add", nullable = false, length = 0)
	public Date getDateAdd() {
		return this.dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_upd", nullable = false, length = 0)
	public Date getDateUpd() {
		return this.dateUpd;
	}

	public void setDateUpd(Date dateUpd) {
		this.dateUpd = dateUpd;
	}

}