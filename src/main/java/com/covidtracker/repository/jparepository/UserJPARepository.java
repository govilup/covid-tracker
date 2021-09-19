package com.covidtracker.repository.jparepository;

import com.covidtracker.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJPARepository extends CrudRepository<User, Long> {
}
