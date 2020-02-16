package dev.projects.springdatajdbc;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Query("select * from projects where state = :state")
    List<Project> findByState(@Param("state") String state);
}
