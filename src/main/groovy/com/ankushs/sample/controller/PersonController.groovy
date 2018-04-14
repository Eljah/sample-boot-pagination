package com.ankushs.sample.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import com.ankushs.sample.domain.Person
import com.ankushs.sample.service.PersonService

@RestController
class PersonController {
	
	final PersonService personService
	
	@Autowired
	def PersonController( PersonService personService ){
		this.personService = personService
	}
	
	@RequestMapping(value="/persons",method=RequestMethod.GET)
	Page<Person> list( Pageable pageable){
		Page<Person> persons = personService.listAllByPage(pageable)
		persons
        //http://localhost:8040/persons?page=0&size=3&sort=name,desc&sort=id,asc
	} 
}
