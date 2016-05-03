package com.ankushs.sample.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import com.ankushs.sample.domain.Person
import com.ankushs.sample.repository.PersonRepository

@Service
@Transactional
class PersonServiceImpl implements PersonService {

	final PersonRepository personRepository
	
	@Autowired
	def PersonServiceImpl(PersonRepository personRepository){
		this.personRepository = personRepository
	}
	
	@Override
	 Page<Person> listAllByPage(Pageable pageable) {
		 personRepository.findAll(pageable)
	}
}
 