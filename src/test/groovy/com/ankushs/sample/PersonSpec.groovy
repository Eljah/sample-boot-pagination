package com.ankushs.sample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration

import spock.lang.Specification

import com.ankushs.sample.domain.Person
import com.ankushs.sample.repository.PersonRepository
@ContextConfiguration(loader = SpringApplicationContextLoader.class,classes=SampleBootPaginationApplication)
class PersonSpec extends Specification{
	
	@Autowired
	PersonRepository personRepository
	
	def setup(){
		(1..20).each{
			personRepository.save(new Person(name:"John $it", age : 22))
		}
	}
	
	def ""(){
		given : 
			int x =0
		expect :
			x==1
	}

}
