package io.agileprojectmanagment.ppmtool.Resource;

import io.agileprojectmanagment.ppmtool.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    Project findByProjectIdentifier(String projectIdentifier);

    @Override
    List<Project> findAll();

    @Override
    void delete(Project entity);
}
