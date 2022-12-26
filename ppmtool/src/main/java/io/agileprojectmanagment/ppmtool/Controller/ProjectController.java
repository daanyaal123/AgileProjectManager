package io.agileprojectmanagment.ppmtool.Controller;

import io.agileprojectmanagment.ppmtool.Entity.Project;
import io.agileprojectmanagment.ppmtool.Service.MapValidationErrorsService;
import io.agileprojectmanagment.ppmtool.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private MapValidationErrorsService mapValidationErrorsService;

    @PostMapping("")
    public ResponseEntity<?> createNewProject(@RequestBody Project project, BindingResult result){

        if(result.hasErrors()){
            return mapValidationErrorsService.mapValidateErrors(result);
        }
        projectService.save(project);
        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }

    @GetMapping("/{projectIdentifier}")
    public ResponseEntity<Project> getProjectByIdentifier(@PathVariable String projectIdentifier){
        Project project=projectService.findProjectByIdentifier(projectIdentifier);
        return new ResponseEntity<Project>(project,HttpStatus.OK);
    }

    @GetMapping("/all")
    public Iterable<Project> getAllProjects(){
        return projectService.findAllProjects();
    }
}

