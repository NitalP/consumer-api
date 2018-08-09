package com.cars.consumer.repository;

import com.cars.consumer.bo.Core;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CoreRepository  extends CrudRepository<Core, UUID> {

}
