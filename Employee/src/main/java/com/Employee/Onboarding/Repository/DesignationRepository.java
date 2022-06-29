package com.Employee.Onboarding.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.Onboarding.Model.DesignationModel;

@Repository
public interface DesignationRepository extends JpaRepository<DesignationModel,Integer> {

}