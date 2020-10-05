package spring.boot.testapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;

   @RequestMapping("/team")
    public List<Teammate> getTeam (){ return  teamService.getTeam(); }

    @RequestMapping("/team/{id}")
    public Optional<Teammate> getTeamMember(@PathVariable String id){
        return teamService.getTeamMember(id);

    }

    @RequestMapping(value = "/team", method = RequestMethod.POST)
    public void addTeamMember (@RequestBody Teammate teammate){
    teamService.addTeamMember(teammate);
     }

    @RequestMapping(value = "/team", method = RequestMethod.PUT)
    public void updateTeamMember (@RequestBody Teammate teammate){ teamService.updateTeamMember(teammate);
    }

    @RequestMapping(value = "/team/{id}", method = RequestMethod.DELETE)
    public void deleteTeamMember (@PathVariable String id){ teamService.deleteTeamMember(id);}

}
