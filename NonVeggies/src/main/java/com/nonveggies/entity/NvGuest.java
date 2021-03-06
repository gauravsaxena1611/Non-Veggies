package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvGuest generated by hbm2java
 */
@Entity
@Table(name = "nv_guest", catalog = "NVPrestashop")
public class NvGuest implements java.io.Serializable {

	private Integer idGuest;
	private Integer idOperatingSystem;
	private Integer idWebBrowser;
	private Integer idCustomer;
	private Boolean javascript;
	private Short screenResolutionX;
	private Short screenResolutionY;
	private Byte screenColor;
	private Boolean sunJava;
	private Boolean adobeFlash;
	private Boolean adobeDirector;
	private Boolean appleQuicktime;
	private Boolean realPlayer;
	private Boolean windowsMedia;
	private String acceptLanguage;
	private boolean mobileTheme;

	public NvGuest() {
	}

	public NvGuest(boolean mobileTheme) {
		this.mobileTheme = mobileTheme;
	}

	public NvGuest(Integer idOperatingSystem, Integer idWebBrowser, Integer idCustomer, Boolean javascript, Short screenResolutionX, Short screenResolutionY,
					Byte screenColor, Boolean sunJava, Boolean adobeFlash, Boolean adobeDirector, Boolean appleQuicktime, Boolean realPlayer,
					Boolean windowsMedia, String acceptLanguage, boolean mobileTheme) {
		this.idOperatingSystem = idOperatingSystem;
		this.idWebBrowser = idWebBrowser;
		this.idCustomer = idCustomer;
		this.javascript = javascript;
		this.screenResolutionX = screenResolutionX;
		this.screenResolutionY = screenResolutionY;
		this.screenColor = screenColor;
		this.sunJava = sunJava;
		this.adobeFlash = adobeFlash;
		this.adobeDirector = adobeDirector;
		this.appleQuicktime = appleQuicktime;
		this.realPlayer = realPlayer;
		this.windowsMedia = windowsMedia;
		this.acceptLanguage = acceptLanguage;
		this.mobileTheme = mobileTheme;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_guest", unique = true, nullable = false)
	public Integer getIdGuest() {
		return this.idGuest;
	}

	public void setIdGuest(Integer idGuest) {
		this.idGuest = idGuest;
	}

	@Column(name = "id_operating_system")
	public Integer getIdOperatingSystem() {
		return this.idOperatingSystem;
	}

	public void setIdOperatingSystem(Integer idOperatingSystem) {
		this.idOperatingSystem = idOperatingSystem;
	}

	@Column(name = "id_web_browser")
	public Integer getIdWebBrowser() {
		return this.idWebBrowser;
	}

	public void setIdWebBrowser(Integer idWebBrowser) {
		this.idWebBrowser = idWebBrowser;
	}

	@Column(name = "id_customer")
	public Integer getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	@Column(name = "javascript")
	public Boolean getJavascript() {
		return this.javascript;
	}

	public void setJavascript(Boolean javascript) {
		this.javascript = javascript;
	}

	@Column(name = "screen_resolution_x")
	public Short getScreenResolutionX() {
		return this.screenResolutionX;
	}

	public void setScreenResolutionX(Short screenResolutionX) {
		this.screenResolutionX = screenResolutionX;
	}

	@Column(name = "screen_resolution_y")
	public Short getScreenResolutionY() {
		return this.screenResolutionY;
	}

	public void setScreenResolutionY(Short screenResolutionY) {
		this.screenResolutionY = screenResolutionY;
	}

	@Column(name = "screen_color")
	public Byte getScreenColor() {
		return this.screenColor;
	}

	public void setScreenColor(Byte screenColor) {
		this.screenColor = screenColor;
	}

	@Column(name = "sun_java")
	public Boolean getSunJava() {
		return this.sunJava;
	}

	public void setSunJava(Boolean sunJava) {
		this.sunJava = sunJava;
	}

	@Column(name = "adobe_flash")
	public Boolean getAdobeFlash() {
		return this.adobeFlash;
	}

	public void setAdobeFlash(Boolean adobeFlash) {
		this.adobeFlash = adobeFlash;
	}

	@Column(name = "adobe_director")
	public Boolean getAdobeDirector() {
		return this.adobeDirector;
	}

	public void setAdobeDirector(Boolean adobeDirector) {
		this.adobeDirector = adobeDirector;
	}

	@Column(name = "apple_quicktime")
	public Boolean getAppleQuicktime() {
		return this.appleQuicktime;
	}

	public void setAppleQuicktime(Boolean appleQuicktime) {
		this.appleQuicktime = appleQuicktime;
	}

	@Column(name = "real_player")
	public Boolean getRealPlayer() {
		return this.realPlayer;
	}

	public void setRealPlayer(Boolean realPlayer) {
		this.realPlayer = realPlayer;
	}

	@Column(name = "windows_media")
	public Boolean getWindowsMedia() {
		return this.windowsMedia;
	}

	public void setWindowsMedia(Boolean windowsMedia) {
		this.windowsMedia = windowsMedia;
	}

	@Column(name = "accept_language", length = 8)
	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}

	@Column(name = "mobile_theme", nullable = false)
	public boolean isMobileTheme() {
		return this.mobileTheme;
	}

	public void setMobileTheme(boolean mobileTheme) {
		this.mobileTheme = mobileTheme;
	}

}
