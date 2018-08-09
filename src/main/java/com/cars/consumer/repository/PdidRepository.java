package com.cars.consumer.repository;

import com.cars.consumer.bo.Pdid;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PdidRepository extends CrudRepository<Pdid, UUID> {

}
