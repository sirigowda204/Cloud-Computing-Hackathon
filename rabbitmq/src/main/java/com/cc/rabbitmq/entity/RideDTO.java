package com.cc.rabbitmq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class RideDTO {

    @Id
    @GeneratedValue
    Integer id;
    Integer seats;
    Integer time;
    Integer cost;
    String pickup;
    String destination;

}
