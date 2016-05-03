package com.ankushs.sample.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
class Person {
	@Id
	@GeneratedValue
	Integer id
	
	@Column
	String name
	
	@Column
	Integer age
}
