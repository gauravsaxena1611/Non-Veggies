package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NvEmployee generated by hbm2java
 */
@Entity
@Table(name = "nv_employee", catalog = "NVPrestashop")
public class NvEmployee implements java.io.Serializable {

	private Integer idEmployee;
	private int idProfile;
	private int idLang;
	private String lastname;
	private String firstname;
	private String email;
	private String passwd;
	private Date lastPasswdGen;
	private Date statsDateFrom;
	private Date statsDateTo;
	private Date statsCompareFrom;
	private Date statsCompareTo;
	private int statsCompareOption;
	private String preselectDateRange;
	private String boColor;
	private String boTheme;
	private String boCss;
	private int defaultTab;
	private int boWidth;
	private boolean boMenu;
	private boolean active;
	private boolean optin;
	private int idLastOrder;
	private int idLastCustomerMessage;
	private int idLastCustomer;
	private Date lastConnectionDate;

	public NvEmployee() {
	}

	public NvEmployee(int idProfile, int idLang, String lastname, String firstname, String email, String passwd, Date lastPasswdGen, int statsCompareOption,
					int defaultTab, int boWidth, boolean boMenu, boolean active, boolean optin, int idLastOrder, int idLastCustomerMessage, int idLastCustomer) {
		this.idProfile = idProfile;
		this.idLang = idLang;
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
		this.passwd = passwd;
		this.lastPasswdGen = lastPasswdGen;
		this.statsCompareOption = statsCompareOption;
		this.defaultTab = defaultTab;
		this.boWidth = boWidth;
		this.boMenu = boMenu;
		this.active = active;
		this.optin = optin;
		this.idLastOrder = idLastOrder;
		this.idLastCustomerMessage = idLastCustomerMessage;
		this.idLastCustomer = idLastCustomer;
	}

	public NvEmployee(int idProfile, int idLang, String lastname, String firstname, String email, String passwd, Date lastPasswdGen, Date statsDateFrom,
					Date statsDateTo, Date statsCompareFrom, Date statsCompareTo, int statsCompareOption, String preselectDateRange, String boColor,
					String boTheme, String boCss, int defaultTab, int boWidth, boolean boMenu, boolean active, boolean optin, int idLastOrder,
					int idLastCustomerMessage, int idLastCustomer, Date lastConnectionDate) {
		this.idProfile = idProfile;
		this.idLang = idLang;
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
		this.passwd = passwd;
		this.lastPasswdGen = lastPasswdGen;
		this.statsDateFrom = statsDateFrom;
		this.statsDateTo = statsDateTo;
		this.statsCompareFrom = statsCompareFrom;
		this.statsCompareTo = statsCompareTo;
		this.statsCompareOption = statsCompareOption;
		this.preselectDateRange = preselectDateRange;
		this.boColor = boColor;
		this.boTheme = boTheme;
		this.boCss = boCss;
		this.defaultTab = defaultTab;
		this.boWidth = boWidth;
		this.boMenu = boMenu;
		this.active = active;
		this.optin = optin;
		this.idLastOrder = idLastOrder;
		this.idLastCustomerMessage = idLastCustomerMessage;
		this.idLastCustomer = idLastCustomer;
		this.lastConnectionDate = lastConnectionDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_employee", unique = true, nullable = false)
	public Integer getIdEmployee() {
		return this.idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

	@Column(name = "id_profile", nullable = false)
	public int getIdProfile() {
		return this.idProfile;
	}

	public void setIdProfile(int idProfile) {
		this.idProfile = idProfile;
	}

	@Column(name = "id_lang", nullable = false)
	public int getIdLang() {
		return this.idLang;
	}

	public void setIdLang(int idLang) {
		this.idLang = idLang;
	}

	@Column(name = "lastname", nullable = false, length = 32)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "firstname", nullable = false, length = 32)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "email", nullable = false, length = 128)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "passwd", nullable = false, length = 32)
	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_passwd_gen", nullable = false, length = 0)
	public Date getLastPasswdGen() {
		return this.lastPasswdGen;
	}

	public void setLastPasswdGen(Date lastPasswdGen) {
		this.lastPasswdGen = lastPasswdGen;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "stats_date_from", length = 0)
	public Date getStatsDateFrom() {
		return this.statsDateFrom;
	}

	public void setStatsDateFrom(Date statsDateFrom) {
		this.statsDateFrom = statsDateFrom;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "stats_date_to", length = 0)
	public Date getStatsDateTo() {
		return this.statsDateTo;
	}

	public void setStatsDateTo(Date statsDateTo) {
		this.statsDateTo = statsDateTo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "stats_compare_from", length = 0)
	public Date getStatsCompareFrom() {
		return this.statsCompareFrom;
	}

	public void setStatsCompareFrom(Date statsCompareFrom) {
		this.statsCompareFrom = statsCompareFrom;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "stats_compare_to", length = 0)
	public Date getStatsCompareTo() {
		return this.statsCompareTo;
	}

	public void setStatsCompareTo(Date statsCompareTo) {
		this.statsCompareTo = statsCompareTo;
	}

	@Column(name = "stats_compare_option", nullable = false)
	public int getStatsCompareOption() {
		return this.statsCompareOption;
	}

	public void setStatsCompareOption(int statsCompareOption) {
		this.statsCompareOption = statsCompareOption;
	}

	@Column(name = "preselect_date_range", length = 32)
	public String getPreselectDateRange() {
		return this.preselectDateRange;
	}

	public void setPreselectDateRange(String preselectDateRange) {
		this.preselectDateRange = preselectDateRange;
	}

	@Column(name = "bo_color", length = 32)
	public String getBoColor() {
		return this.boColor;
	}

	public void setBoColor(String boColor) {
		this.boColor = boColor;
	}

	@Column(name = "bo_theme", length = 32)
	public String getBoTheme() {
		return this.boTheme;
	}

	public void setBoTheme(String boTheme) {
		this.boTheme = boTheme;
	}

	@Column(name = "bo_css", length = 64)
	public String getBoCss() {
		return this.boCss;
	}

	public void setBoCss(String boCss) {
		this.boCss = boCss;
	}

	@Column(name = "default_tab", nullable = false)
	public int getDefaultTab() {
		return this.defaultTab;
	}

	public void setDefaultTab(int defaultTab) {
		this.defaultTab = defaultTab;
	}

	@Column(name = "bo_width", nullable = false)
	public int getBoWidth() {
		return this.boWidth;
	}

	public void setBoWidth(int boWidth) {
		this.boWidth = boWidth;
	}

	@Column(name = "bo_menu", nullable = false)
	public boolean isBoMenu() {
		return this.boMenu;
	}

	public void setBoMenu(boolean boMenu) {
		this.boMenu = boMenu;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name = "optin", nullable = false)
	public boolean isOptin() {
		return this.optin;
	}

	public void setOptin(boolean optin) {
		this.optin = optin;
	}

	@Column(name = "id_last_order", nullable = false)
	public int getIdLastOrder() {
		return this.idLastOrder;
	}

	public void setIdLastOrder(int idLastOrder) {
		this.idLastOrder = idLastOrder;
	}

	@Column(name = "id_last_customer_message", nullable = false)
	public int getIdLastCustomerMessage() {
		return this.idLastCustomerMessage;
	}

	public void setIdLastCustomerMessage(int idLastCustomerMessage) {
		this.idLastCustomerMessage = idLastCustomerMessage;
	}

	@Column(name = "id_last_customer", nullable = false)
	public int getIdLastCustomer() {
		return this.idLastCustomer;
	}

	public void setIdLastCustomer(int idLastCustomer) {
		this.idLastCustomer = idLastCustomer;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "last_connection_date", length = 0)
	public Date getLastConnectionDate() {
		return this.lastConnectionDate;
	}

	public void setLastConnectionDate(Date lastConnectionDate) {
		this.lastConnectionDate = lastConnectionDate;
	}

}
