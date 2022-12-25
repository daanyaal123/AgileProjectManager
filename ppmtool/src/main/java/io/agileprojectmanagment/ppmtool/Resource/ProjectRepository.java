package io.agileprojectmanagment.ppmtool.Resource;

import io.agileprojectmanagment.ppmtool.Entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {
}
