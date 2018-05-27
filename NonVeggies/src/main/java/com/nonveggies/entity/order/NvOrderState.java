package com.nonveggies.entity.order;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvOrderState generated by hbm2java
 */
@Entity
@Table(name = "nv_order_state", catalog = "NVPrestashop")
public class NvOrderState implements java.io.Serializable {

	private Integer idOrderState;
	private Boolean invoice;
	private boolean sendEmail;
	private String moduleName;
	private String color;
	private boolean unremovable;
	private boolean hidden;
	private boolean logable;
	private boolean delivery;
	private boolean shipped;
	private boolean paid;
	private boolean pdfInvoice;
	private boolean pdfDelivery;
	private boolean deleted;

	public NvOrderState() {
	}

	public NvOrderState(boolean sendEmail, boolean unremovable, boolean hidden, boolean logable, boolean delivery, boolean shipped, boolean paid,
					boolean pdfInvoice, boolean pdfDelivery, boolean deleted) {
		this.sendEmail = sendEmail;
		this.unremovable = unremovable;
		this.hidden = hidden;
		this.logable = logable;
		this.delivery = delivery;
		this.shipped = shipped;
		this.paid = paid;
		this.pdfInvoice = pdfInvoice;
		this.pdfDelivery = pdfDelivery;
		this.deleted = deleted;
	}

	public NvOrderState(Boolean invoice, boolean sendEmail, String moduleName, String color, boolean unremovable, boolean hidden, boolean logable,
					boolean delivery, boolean shipped, boolean paid, boolean pdfInvoice, boolean pdfDelivery, boolean deleted) {
		this.invoice = invoice;
		this.sendEmail = sendEmail;
		this.moduleName = moduleName;
		this.color = color;
		this.unremovable = unremovable;
		this.hidden = hidden;
		this.logable = logable;
		this.delivery = delivery;
		this.shipped = shipped;
		this.paid = paid;
		this.pdfInvoice = pdfInvoice;
		this.pdfDelivery = pdfDelivery;
		this.deleted = deleted;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_order_state", unique = true, nullable = false)
	public Integer getIdOrderState() {
		return this.idOrderState;
	}

	public void setIdOrderState(Integer idOrderState) {
		this.idOrderState = idOrderState;
	}

	@Column(name = "invoice")
	public Boolean getInvoice() {
		return this.invoice;
	}

	public void setInvoice(Boolean invoice) {
		this.invoice = invoice;
	}

	@Column(name = "send_email", nullable = false)
	public boolean isSendEmail() {
		return this.sendEmail;
	}

	public void setSendEmail(boolean sendEmail) {
		this.sendEmail = sendEmail;
	}

	@Column(name = "module_name")
	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	@Column(name = "color", length = 32)
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Column(name = "unremovable", nullable = false)
	public boolean isUnremovable() {
		return this.unremovable;
	}

	public void setUnremovable(boolean unremovable) {
		this.unremovable = unremovable;
	}

	@Column(name = "hidden", nullable = false)
	public boolean isHidden() {
		return this.hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	@Column(name = "logable", nullable = false)
	public boolean isLogable() {
		return this.logable;
	}

	public void setLogable(boolean logable) {
		this.logable = logable;
	}

	@Column(name = "delivery", nullable = false)
	public boolean isDelivery() {
		return this.delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

	@Column(name = "shipped", nullable = false)
	public boolean isShipped() {
		return this.shipped;
	}

	public void setShipped(boolean shipped) {
		this.shipped = shipped;
	}

	@Column(name = "paid", nullable = false)
	public boolean isPaid() {
		return this.paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	@Column(name = "pdf_invoice", nullable = false)
	public boolean isPdfInvoice() {
		return this.pdfInvoice;
	}

	public void setPdfInvoice(boolean pdfInvoice) {
		this.pdfInvoice = pdfInvoice;
	}

	@Column(name = "pdf_delivery", nullable = false)
	public boolean isPdfDelivery() {
		return this.pdfDelivery;
	}

	public void setPdfDelivery(boolean pdfDelivery) {
		this.pdfDelivery = pdfDelivery;
	}

	@Column(name = "deleted", nullable = false)
	public boolean isDeleted() {
		return this.deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}