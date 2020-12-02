package com.thoughtworks.springbootemployee.listener;

import com.thoughtworks.springbootemployee.entity.Employee;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class EmployeeListener {

  @PrePersist
  void onPrePersist(Employee employee) {
    System.out.println("MyEntityListener.onPrePersist(): " + employee.getName());
  }

  @PostPersist
  void onPostPersist(Employee employee) {
    System.out.println("MyEntityListener.onPostPersist(): " + employee.getName());
  }

  @PostLoad
  void onPostLoad(Employee employee) {
    System.out.println("MyEntityListener.onPostLoad(): " + employee.getName());
  }

  @PreUpdate
  void onPreUpdate(Employee employee) {
    System.out.println("MyEntityListener.onPreUpdate(): " + employee.getName());
  }

  @PostUpdate
  void onPostUpdate(Employee employee) {
    System.out.println("MyEntityListener.onPostUpdate(): " + employee.getName());
  }

  @PreRemove
  void onPreRemove(Employee employee) {
    System.out.println("MyEntityListener.onPreRemove(): " + employee.getName());
  }

  @PostRemove
  void onPostRemove(Employee employee) {
    System.out.println("MyEntityListener.onPostRemove(): " + employee.getName());
  }
}
