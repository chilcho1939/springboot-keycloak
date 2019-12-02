package com.buzzybrains;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@MappedSuperclass
public abstract class AbstractBaseEntity implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@Column(name="create_user", updatable = false)
	protected String createUser;
	
	@Column(name="create_time", insertable = false, updatable = false)
	protected Date createTime;
	
	@Column(name="update_user")
	protected String updateUser;
	
	@Column(name="update_time")
	protected Date updateTime;
}
