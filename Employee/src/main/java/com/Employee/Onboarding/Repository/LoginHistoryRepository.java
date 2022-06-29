package com.Employee.Onboarding.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.Onboarding.Model.LoginHistory;

@Repository
public interface LoginHistoryRepository extends JpaRepository <LoginHistory,Long>{


}