package com.siemens.training.restproject;

import org.springframework.data.repository.CrudRepository;

public interface IPersonDao extends CrudRepository<Person,Long> {
}
