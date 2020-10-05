package spring.boot.testapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Teammate> getTeam() {
        List<Teammate> team = new ArrayList<>();
        teamRepository.findAll().forEach(team::add);
        return team;
    }

    public Optional<Teammate> getTeamMember(String id) {
        return teamRepository.findById(id);
    }

    public void addTeamMember(Teammate newTeamMember) {
        teamRepository.save(newTeamMember);
    }

    public void updateTeamMember(Teammate updatedTeamMember) {
         teamRepository.save(updatedTeamMember);
    }

       public void deleteTeamMember(String id) {
       teamRepository.deleteById(id);
}

        }
