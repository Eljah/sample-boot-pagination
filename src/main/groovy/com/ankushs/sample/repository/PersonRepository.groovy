package com.ankushs.sample.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.PagingAndSortingRepository

import com.ankushs.sample.domain.Person

interface PersonRepository extends JpaRepository<Person,Integer> {

}
