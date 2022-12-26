package io.agileprojectmanagment.ppmtool.Service;

import io.agileprojectmanagment.ppmtool.Entity.Project;
import io.agileprojectmanagment.ppmtool.Exception.ProjectIdException;
import io.agileprojectmanagment.ppmtool.Resource.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project save(Project project){
        try{
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        }
        catch(Exception exception){
            throw new ProjectIdException("Project Identifier :- "+project.getProjectIdentifier().toUpperCase()+" already exists");
        }
    }

    public Project findProjectByIdentifier(String projectIdentifier){

        Project project=projectRepository.findByProjectIdentifier(projectIdentifier.toUpperCase());
        if(project==null) throw new ProjectIdException("Project Identifier "+projectIdentifier+" does not exists");
        return project;
    }

    public Iterable<Project> findAllProjects(){
        Iterable<Project> allProjects=projectRepository.findAll();
        return allProjects;
    }
}
