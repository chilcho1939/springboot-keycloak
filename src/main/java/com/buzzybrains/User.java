package com.buzzybrains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="user")
@Data
public class User extends AbstractBaseEntity {

	/**
	 * Serial Version
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="username", nullable = false, length = 50)
	private String username;
	
	@Column(name="password", nullable = false, length = 100)
	private String password;
	
	@Column(name="email", nullable = false, length = 50)
	private String email;

}
