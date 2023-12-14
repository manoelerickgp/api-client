package com.project.clientapi.repositories;

import com.project.clientapi.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT t FROM tb_persons t WHERE t.birthday BETWEEN :birthdayStart and :birthdayEnd")
    List<Person> findByBirthdayBetween(LocalDate birthdayStart, LocalDate birthdayEnd);

}