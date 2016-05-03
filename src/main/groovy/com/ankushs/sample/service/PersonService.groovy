package com.ankushs.sample.service

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

import com.ankushs.sample.domain.Person

interface PersonService {
	Page<Person> listAllByPage(Pageable pageable)
}
 