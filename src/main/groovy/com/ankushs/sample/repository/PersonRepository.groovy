package com.ankushs.sample.repository

import org.springframework.data.repository.PagingAndSortingRepository

import com.ankushs.sample.domain.Person

interface PersonRepository extends PagingAndSortingRepository<Person,Integer> {

}
