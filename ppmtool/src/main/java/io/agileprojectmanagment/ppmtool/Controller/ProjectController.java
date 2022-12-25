package io.agileprojectmanagment.ppmtool.Controller;

import io.agileprojectmanagment.ppmtool.Entity.Project;
import io.agileprojectmanagment.ppmtool.Service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ProjectController {
    //    @Autowired
    private ProjectService projectService;

    @PostMapping("")
    public ResponseEntity<Project> createNewProject(@RequestBody Project project){
        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }
}
