package com.isc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Proxy;

/**
 * Specialization generated by hbm2java
 */
@Entity
@Table(name = "specialization", catalog = "my_db", uniqueConstraints = @UniqueConstraint(columnNames = "specialization_id"))
@Proxy(lazy = false)
public class Specialization implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String specializationId;
	private String specializationName;
	private boolean active;

	public Specialization() {
	}

	public Specialization(String specializationId, String specializationName, boolean active) {
		this.specializationId = specializationId;
		this.specializationName = specializationName;
		this.active = active;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "specialization_id", unique = true, nullable = false, length = 30)
	public String getSpecializationId() {
		return this.specializationId;
	}

	public void setSpecializationId(String specializationId) {
		this.specializationId = specializationId;
	}

	@Column(name = "specialization_name", nullable = false, length = 50)
	public String getSpecializationName() {
		return this.specializationName;
	}

	public void setSpecializationName(String specializationName) {
		this.specializationName = specializationName;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
