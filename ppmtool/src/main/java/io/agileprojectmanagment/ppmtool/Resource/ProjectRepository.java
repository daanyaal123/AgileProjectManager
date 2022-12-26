package io.agileprojectmanagment.ppmtool.Resource;

import io.agileprojectmanagment.ppmtool.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {
    Project findByProjectIdentifier(String projectIdentifier);

    @Override
    Iterable<Project> findAll();
}
