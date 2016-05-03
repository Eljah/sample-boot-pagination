package com.ankushs.sample
 
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration

import com.ankushs.sample.domain.Person
import com.ankushs.sample.repository.PersonRepository

@RunWith(SpringJUnit4ClassRunner)
@SpringApplicationConfiguration(classes = SampleBootPaginationApplication)
@WebAppConfiguration
class SampleBootPaginationApplicationTests {
	
	@Autowired
	PersonRepository personRepository
	 
	@Test
	void contextLoads() { 
		def person 
		(1..20).each{
			person = new Person(name:"John $it", age : 22)
			personRepository.save(person)
		}
	}
}
