package io.agileprojectmanagment.ppmtool.Service;

import io.agileprojectmanagment.ppmtool.Entity.Project;
import io.agileprojectmanagment.ppmtool.Resource.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdate(Project project){
        return projectRepository.save(project);
    }
}
