package com.panda.telecom.plans.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.panda.telecom.plans.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {
	


}
