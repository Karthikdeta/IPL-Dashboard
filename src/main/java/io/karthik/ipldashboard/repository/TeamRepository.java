package io.karthik.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.karthik.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
