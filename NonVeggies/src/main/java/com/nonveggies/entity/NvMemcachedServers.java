package com.nonveggies.entity;

// Generated Jan 2, 2016 7:30:29 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NvMemcachedServers generated by hbm2java
 */
@Entity
@Table(name = "nv_memcached_servers", catalog = "NVPrestashop")
public class NvMemcachedServers implements java.io.Serializable {

	private Integer idMemcachedServer;
	private String ip;
	private int port;
	private int weight;

	public NvMemcachedServers() {
	}

	public NvMemcachedServers(String ip, int port, int weight) {
		this.ip = ip;
		this.port = port;
		this.weight = weight;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_memcached_server", unique = true, nullable = false)
	public Integer getIdMemcachedServer() {
		return this.idMemcachedServer;
	}

	public void setIdMemcachedServer(Integer idMemcachedServer) {
		this.idMemcachedServer = idMemcachedServer;
	}

	@Column(name = "ip", nullable = false, length = 254)
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "port", nullable = false)
	public int getPort() {
		return this.port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Column(name = "weight", nullable = false)
	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
