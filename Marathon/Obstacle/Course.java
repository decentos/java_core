package JavaCore.Marathon.Obstacle;


import JavaCore.Marathon.Participants.Competitor;
import JavaCore.Marathon.Participants.Team;

public class Course {

    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Competitor c : team.getCompetitors()) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance())
                    break;
            }
        }
    }
}
