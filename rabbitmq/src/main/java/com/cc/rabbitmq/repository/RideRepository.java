package com.cc.rabbitmq.repository;

import com.cc.rabbitmq.entity.RideDTO;
import org.springframework.data.repository.CrudRepository;

public interface RideRepository extends CrudRepository<RideDTO, Integer> {
}
